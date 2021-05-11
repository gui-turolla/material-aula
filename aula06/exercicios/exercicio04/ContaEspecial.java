package exercicios.exercicio04;

public class ContaEspecial extends Conta {
    double limite;
    public ContaEspecial(int numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = limite;
    }
    public boolean saque(double valor){
        if(limite + getDados()[1] >= valor){
            return super.saque(valor);
        }
        return false;
    }
}
