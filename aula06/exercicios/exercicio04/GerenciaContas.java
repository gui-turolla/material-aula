package exercicios.exercicio04;

import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> contas;
    

    public GerenciaContas(){
        this.contas = new ArrayList<>();
    }   
    
    public void novaContaCorrente(int numeroConta){
        contas.add(new ContaCorrente(numeroConta,0));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.add(new ContaEspecial(numeroConta,0,limite));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.add(new ContaPoupanca(numeroConta,0));
    }

    public boolean fazerDeposito(int numeroConta, double valor){
        for (Conta objConta : contas) {
            if(objConta.getDados()[0] == numeroConta){
                if(objConta.deposito(valor)){
                    return true;
                }
                    return false;
            }
        }
        return false;
    }

    public boolean fazerSaque(int numeroConta, double valor){
        for (Conta objConta : contas) {
            if(objConta.getDados()[0] == numeroConta){
                if(objConta.saque(valor)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }


    public String exibirSaldo(int numeroConta){
        for (Conta objConta : contas) {
            if(objConta.getDados()[0] == numeroConta){
                return objConta.toString();
            }
        }
        return "Conta não encontrada.";
    }
}
