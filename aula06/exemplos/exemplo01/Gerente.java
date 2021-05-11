package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionario;
    
    public Gerente(String nome, double salario, int numFuncionario){
        super(nome, salario);
        this.numFuncionario = numFuncionario;
    }

    public void aumentaSalario(double porc){
        super.aumentaSalario(porc + 10);
    }
}
