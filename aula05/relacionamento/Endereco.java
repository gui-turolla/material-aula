package relacionamento;



public class Endereco {
    private String logradouro;
    private int numero;

    Endereco(String logradouro, int numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public void exibir(){
        System.out.println(logradouro + ", " + numero);
    }
}
