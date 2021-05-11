package exercicios.exercicio04;

public abstract class Conta {
    private int numero;
    private double saldo;
    
    
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double[] getDados(){
        double[] dados = {numero,saldo};
        return dados;
    }

    public boolean deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;      
    }

    public boolean saque(double valor){
        if(valor > 0){
            this.saldo -= valor;
            return true;
        }
        return false;    
    }

    public String toString(){
        return "Conta: "+numero+ " Saldo: R$ "+ saldo;
    }
}
