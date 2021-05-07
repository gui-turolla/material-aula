package exercícios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao;
        System.out.println("======= Prefeitura do Rio de Janeiro =======");
        System.out.println("Digite seu salário Bruto: ");
        salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da Prestação: ");
        prestacao = entrada.nextDouble();
        System.out.println("============================================");
        if (prestacao > (salarioBruto*0.3)){
            System.out.printf("O empréstimo no valor de: R$%.2f ",prestacao);
            System.out.println("foi negado, pois ultrapassa em 30% ou mais do seu salário bruto.");
        }
        else{
            System.out.printf("O empréstimo no valor de: R$%.2f ",prestacao);
            System.out.println("foi aprovado, pois está abaixo de 30% ou menos do seu salário bruto.");
        }
        entrada.close();
        System.out.println("Programa encerrado.");
    }
}
