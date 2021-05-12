package exercicios.exercicio04;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;
    

    public GerenciaContas(){
        this.contas = new HashMap<>();
    }   
    
    public void novaContaCorrente(int numeroConta){
        contas.put(numeroConta,new ContaCorrente(numeroConta,0));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.put(numeroConta,new ContaEspecial(numeroConta,0,limite));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.put(numeroConta,new ContaPoupanca(numeroConta,0));
    }

    public boolean fazerDeposito(int numeroConta, double valor){
        Conta objConta = contas.get(numeroConta);
        if(objConta != null){
            return (objConta.deposito(valor));
        }      
        return false;
    }

    public boolean fazerSaque(int numeroConta, double valor){
        Conta objConta = contas.get(numeroConta);
        if(objConta != null){
            return (objConta.saque(valor));
        }      
        return false;
    }

    public String exibirSaldo(int numeroConta){
        Conta objConta = contas.get(numeroConta);
        if(objConta != null){
            return objConta.toString();
        }   
        return "Conta não encontrada.";
    }
}