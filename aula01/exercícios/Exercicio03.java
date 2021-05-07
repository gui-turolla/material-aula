package exercicíos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, newSalario;
        System.out.println("Digite o salário do Funcionário para calcular o aumento de 25%: ");
        salario = entrada.nextDouble();
        newSalario = salario * 1.25;
        System.out.println("O salário de R$"+salario+" com 25% de aumento passa a ser: R$"+newSalario);
        entrada.close();
    }
}
