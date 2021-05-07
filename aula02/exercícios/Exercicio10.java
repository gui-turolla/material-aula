package exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor,calc,i = 0;
        System.out.println("Digite um número para saber sua tabuada");
        valor = entrada.nextInt();
        entrada.close();
        System.out.println("======== Resultado da Tabuada ========");
        while(i<=10){
            calc = valor * i;
            System.out.printf("%d x %02d = %02d \n",valor,i,calc);
            i++;
        }
    }
}
