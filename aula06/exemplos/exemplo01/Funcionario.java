package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String exibir(){
        return nome + ", " + salario;
    }

    public void aumentaSalario(double porc){
        salario += salario * porc/100;
    }
}
