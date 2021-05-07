package exercicíos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double minSal, kw, kwValor, kwTotal;
        System.out.println("Digite o Salário Mínimo:");
        minSal = entrada.nextDouble();
        System.out.println("Digite o Consumo em Kw:");
        kw = entrada.nextDouble();
        kwValor = minSal / 500;
        kwTotal = kwValor * kw;
        System.out.println("O valor do Kw é de: R$"+kwValor);
        System.out.println("O valor a ser pago pelo Consumo de Kw é de: R$"+kwTotal);
        System.out.println("O valor a ser pago pelo Consumo de Kw com 15% de desconto é de: R$"+ (kwTotal * 0.85));
        entrada.close();
    }
}