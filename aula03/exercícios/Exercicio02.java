package exercícios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num=1,soma=0,i=1;
        while(num != 0){
            System.out.printf("Digite o %d° Número: (0 para parar) ",i);
            num = entrada.nextInt();
            soma += num;
            i++;
        }
        System.out.printf("A soma dos valores é: %d",soma);
        entrada.close();
    }
}


