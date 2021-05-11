package relacionamento;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;
    
    Pessoa(String nome, Endereco endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public void exibir(){
        System.out.println("Meu nome é: "+ nome + " e tenho "+ idade+" anos");
        endereco.exibir();
    }
}
