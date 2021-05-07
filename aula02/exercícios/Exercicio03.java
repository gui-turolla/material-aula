package exercícios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double entrada1, entrada2;
        System.out.println("Digite o primeiro Número");
        entrada1 = entrada.nextDouble();
        System.out.println("Digite o segundo Número");
        entrada2 = entrada.nextDouble();
        if (entrada1 > entrada2){
            System.out.println(entrada1);
            System.out.println(entrada2);
        }
        else{
            System.out.println(entrada2);
            System.out.println(entrada1);
        }
        entrada.close();
    }
}
