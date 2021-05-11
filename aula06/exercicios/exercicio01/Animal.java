package exercicios.exercicio01;


public class Animal {
    private String nome,raca;
    private int nascimento;
    private Proprietário proprietario;
    
    Animal(String nome, String raca, Proprietário proprietario, int anoNascimento){
        this.nome = nome;
        this.raca = raca;
        this.proprietario = proprietario;
        this.nascimento = anoNascimento;
    }

    public void exibir(){
        System.out.printf("O animal de nome %s possui a raça %s e nasceu no ano de %d, seu proprietário chama-se %s e seu número para contato é: %d\n",nome,raca,nascimento,proprietario.getNome(),proprietario.getTelefone());
    }
}