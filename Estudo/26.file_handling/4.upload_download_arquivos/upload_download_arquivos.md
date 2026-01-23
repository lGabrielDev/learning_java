## Upload e Download de arquivos

<br>

### Upload (enviar arquivo pro servidor)

- O usuário acessa sua API e envia o arquivo via POST.

- O arquivo vai no corpo da requisição como MultipartFile.

- O servidor pega os bytes e salva no disco ou no banco.



<hr>
<br>

<br>

### Download (baixar arquivo do servidor)

- O usuário acessa sua API via GET.

- O servidor pega o arquivo salvo (do banco)

- Retorna os bytes com o Content-Type correto no corpo da requisicao. Dependendo do tipo do arquivo informamos um Content-Type diferente.

- O navegador ou cliente interpreta os bytes e mostra ou baixa o arquivo.




<hr>
<br>

## Prática:

```java
@RestController
@RequestMapping("")
public class TesteController {

     //attributes
     @Autowired
     private ArquivoRepository arquivoRepository;


     //imagine que alguem acessou sua API e quer enviar um arquivo pra voce (image, pdf , etc...)


     // RequestParam sao passados de 2 formas:
          // - Dados simples (String, int, long...) → geralmente vão na URL como RequestParam
          // - Arquivos → sempre vão no corpo da requisição como MultipartFile.
     @PostMapping("/api")
     public ResponseEntity<String> uploadFile(
          @RequestParam(name="arquivo") MultipartFile arquivoTal) throws Exception 
     {
          //criamos uma classe para pegar todas as infos do arquivo enviado.....
          ArquivoPadrao a1 = new ArquivoPadrao();
          a1.setFileName(arquivoTal.getOriginalFilename());
          a1.setFileType(arquivoTal.getContentType());
          a1.setFileData(arquivoTal.getBytes());
     
          //salvamos no banco
          arquivoRepository.save(a1);

          //definimos onde vamos salvar o arquivo
          Path caminhoArquivo = Paths.get("src/main/java/com/example/demo/");
          File arquivoNovo = new File(caminhoArquivo + a1.getFileName());

          //escrevemos os bytes recebidos no arquivo
          FileOutputStream escreverArquivo = new FileOutputStream(arquivoNovo);
          escreverArquivo.write(a1.getFileData());
          escreverArquivo.close();
          
          return ResponseEntity.ok("adassda");
     }



     //alguem entrou no seu site pra fazer download de uma image....
     @GetMapping("/curriculo")
     public ResponseEntity<byte[]> downloadImage(){
          
          ArquivoPadrao a1 = this.arquivoRepository.findById(1l).get();

          return ResponseEntity.ok()
               .contentType(MediaType.valueOf(a1.getFileType())) //informamos como esses bytes vao ser mostrados no navegador. Nesse caso, um pdf
               .body(a1.getFileData()); //enviamos os bytes

     }

     @GetMapping("/image")
     public ResponseEntity<byte[]> downloadImage2(){
          
          ArquivoPadrao a1 = this.arquivoRepository.findById(25l).get();

          return ResponseEntity.ok()
               .contentType(MediaType.valueOf(a1.getFileType()))
               .body(a1.getFileData());
     }
}
````