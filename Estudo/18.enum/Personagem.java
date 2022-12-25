package main.java.br.com.leekbiel.projeto.classes;

import main.java.br.com.leekbiel.projeto.constants.ClasseDoPersonagem;

public class Personagem {
    //attributes
    String name;
    Integer age;
    String email;
    ClasseDoPersonagem classeEscolhida; // enum bolado criado

    //constructors
    public Personagem(String name, Integer age, String email, ClasseDoPersonagem classeEscolhida){
        this.name = name;
        this.age = age;
        this.email = email;
        this.classeEscolhida = classeEscolhida;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClasseDoPersonagem getClasseEscolhida(){
        return this.classeEscolhida;
    }

    public void setClasseEscolhida(ClasseDoPersonagem classeEscolhida){
        this.classeEscolhida = classeEscolhida;
    }

    //toString method
    @Override
    public String toString(){
        return String.format("\n\n=== Dados do personagem ===\nName: %s\nAge: %d\nEmail: %s\n=== Dados da classe ===\n%s",this.name,this.age,this.email,this.classeEscolhida);
    }
}
