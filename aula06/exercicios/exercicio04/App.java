package exercicios.exercicio04;

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
        GerenciaContas contas = new GerenciaContas();
        Scanner entrada = new Scanner(System.in);
        do{
            menu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o limite: ");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite); 
                    break;

                case 3:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o valor: R$");
                    valor = entrada.nextDouble();
                    if(contas.fazerDeposito(numeroConta, valor)){
                        System.out.println("Depósito Realizado.");
                    }
                    else{
                        System.out.println("Falha na Operação."); 
                    }
                    break;

                case 5:
                    System.out.printf("\nInforme o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.printf("\nInforme o valor: R$");
                    valor = entrada.nextDouble();
                    if(contas.fazerSaque(numeroConta, valor)){
                        System.out.println("Saque Realizado.");
                    }
                    else{
                        System.out.println("Falha na Operação."); 
                    }                    
                    break;

                case 6:
                    System.out.printf("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("");
                    System.out.println("--------------- Resumo ----------------");
                    System.out.println(contas.exibirSaldo(numeroConta));
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
    }
}