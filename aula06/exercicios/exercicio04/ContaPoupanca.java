package exercicios.exercicio04;

public class ContaPoupanca extends Conta{
    private static double taxa;

    public ContaPoupanca (int numero, double saldo){
        super(numero, saldo);
    }

    public static void setTaxa(double taxa){
        if(taxa > 0){
            ContaPoupanca.taxa = taxa;
        }
    }
    public boolean saque(double valor){
        if (valor + taxa <= getDados()[1]){
            return super.saque(valor + taxa);
        }
        return false;
    } 

}
