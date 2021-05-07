package exercicíos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;        
        System.out.println("Digite as notas para calcular a média\nDigite a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2 )/2;
        entrada.close();
        System.out.println("A média de "+ nota1 + " e " + nota2 + " é de "+ media);
    }
}
