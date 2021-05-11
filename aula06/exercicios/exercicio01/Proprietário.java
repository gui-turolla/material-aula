package exercicios.exercicio01;

public class Proprietário {
    private String nome;
    private int telefone;

    Proprietário(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public int getTelefone(){
        return telefone;
    }

}
