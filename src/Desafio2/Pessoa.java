package Desafio2;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void saudacao(){
        System.out.printf("Olá, sou "+ nome + ", ");
    }

    public String getNome(){
        return nome;
    }
}
