package exercícios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Digite um Valor: ");
        valor = entrada.nextInt();
        if (valor > 20) {
            System.out.println("A metade de " + valor + " é " + (valor / 2.0));
        }
        entrada.close();
    }
}
