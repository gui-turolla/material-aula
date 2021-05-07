package exercícios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        media = ((nota1 * 4) + (nota2 * 6)) / 10;
        if(media >= 6.0){
            System.out.printf("A média foi %.2f. O aluno foi Aprovado",media);
        }
        else{
            System.out.printf("A média foi %.2f. O aluno foi Reprovado", media);
        }
        entrada.close();
        System.out.println("Programa finalizado.");
    }
}
