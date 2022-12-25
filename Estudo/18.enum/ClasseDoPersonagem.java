package main.java.br.com.leekbiel.projeto.constants;

public enum ClasseDoPersonagem {
    //constants
    WARRIOR("Warior",5,8,"Cidade da luz"),
    NINJA("Ninja",7,5,"Floresta sombria"),
    MAGE("Mage",8,4,"Bosque das fadas");

    //attributes
    String name;
    Integer forca;
    Integer defesa;
    String regiao;


    //constructors
    private ClasseDoPersonagem(String name,Integer forca, Integer defesa, String regiao){
        this.name = name;
        this.forca = forca;
        this.defesa = defesa;
        this.regiao = regiao;
    }

    //getters and setters
    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    //toString() Method
    @Override
    public String toString(){
        return String.format("Name: %s\nForca: %d\nDefesa: %d\nRegião: %s",this.name,this.forca,this.defesa,this.regiao);
    }
}