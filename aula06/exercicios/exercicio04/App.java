package exercicios.exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static void menu(){
        System.out.println("---------- CRIAÇÃO DE CONTAS ----------");
        System.out.println("1- Nova conta corrente");
        System.out.println("2- Nova conta especial");
        System.out.println("3- Nova conta poupança");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("-------------- OPERAÇÕES --------------");
        System.out.println("4- Realizar depósito");
        System.out.println("5- Realizar saque");
        System.out.println("6- Exibir saldo");
        System.out.println("7- Sair");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.printf("Informe a Opção desejada: ");
    };
    public static void main(String[] args) {
        int opcao, numeroConta;
        double limite, valor;
        ArrayList<Conta> contas = new ArrayList<>();
        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaEspecial ce = null;
        Scanner entrada = new Scanner(System.in);
        do{
            menu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta,0);
                    contas.add(cc);
                    break;
                case 2:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o limite: ");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta,0,limite);
                    contas.add(ce);  
                    break;
                case 3:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta,0);
                    contas.add(cp);
                    break;
                case 4:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o valor: R$");
                    valor = entrada.nextDouble();

                    for (Conta objConta : contas) {
                        if(objConta.getDados()[0] == numeroConta){
                            if(objConta.deposito(valor)){
                                System.out.println("Depósito Realizado.");
                            }
                            else{
                                System.out.println("Falha na Operação."); 
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o valor: R$");
                    valor = entrada.nextDouble();

                    for (Conta objConta : contas) {
                        if(objConta.getDados()[0] == numeroConta){
                            if(objConta.saque(valor)){
                                System.out.println("Saque Realizado.");
                            }
                            else{
                                System.out.println("Falha na Operação."); 
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.printf("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("");
                    System.out.println("--------------- Resumo ----------------");
                    for (Conta objConta : contas) {
                        if(objConta.getDados()[0] == numeroConta){
                            System.out.println(objConta);
                        }
                    }
                    System.out.println();
                    
                    break;
                case 7:
                    System.out.println("---------------------------------------");
                    System.out.println("Programa Encerrado com sucesso.");
                    System.out.println("---------------------------------------");
                    break;
            
                default:
                System.out.println("\nOpção Inválida.\n");
                    break;
            }
        }while (opcao !=7);

        entrada.close();









        // Conta cc = new ContaCorrente(321332, 400);
        // Conta ce = new ContaEspecial(542543, 0, 100);
        // Conta cp = new ContaPoupanca(321434, 400);

        // // Conta Especial //
        // System.out.printf("\n\n------- Conta Especial -------\n\n ");
        // menu(ce);
        // if(ce.deposito(100)){
        //     System.out.println("Depósito realizado com Sucesso.");
        // }
        // else{
        //     System.out.println(ce);
        // }
        // menu(ce);
        // if(ce.saque(150)){
        //     System.out.println("Saque realizado com sucesso.");
        // }
        // else{
        //     System.out.println("Saque negado.");
        // }
        // menu(ce);

        // // Conta Poupança //
        // System.out.printf("\n\n------- Conta Poupança -------\n\n ");
        // menu(cp);
        // if(cp.saque(300)){
        //     System.out.println("Saque realizado com sucesso.");
        // }
        // else{
        //     System.out.println("Saque negado.");
        // }
        // menu(cp);
        // if(cp.deposito(300)){
        //     System.out.println("Depósito realizado com Sucesso.");
        // }
        // else{
        //     System.out.println(cp);
        // }
        // menu(cp);

        // // Conta Corrente //
        // System.out.printf("\n------- Conta Corrente -------\n\n ");
        // menu(cc);
        // if(cc.saque(300)){
        //     System.out.println("Saque realizado com sucesso.");
        // }
        // else{
        //     System.out.println("Saque negado.");
        // }
        // menu(cc);
        // if(cc.deposito(300)){
        //     System.out.println("Depósito realizado com Sucesso.");
        // }
        // else{
        //     System.out.println(cc);
        // }
        // menu(cc);

    }
}
