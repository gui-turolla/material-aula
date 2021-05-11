package exercicios.exercicio04;

public class ContaCorrente extends Conta {
    private final double TAXA = 0.10;
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }

    public boolean saque(double valor){
        if (valor <= getDados()[1]){
            return super.saque(valor);
        }
        return false;        
    }

    public boolean deposito(double valor){
        if(valor>0){
            return super.deposito(valor - TAXA);
        }
        return false;
    }  
}
