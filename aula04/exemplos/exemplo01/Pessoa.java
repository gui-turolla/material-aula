package exemplos.exemplo01;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá! Eu sou " + nome + " e tenho "+idade + " anos.");
    }
}