package exercícios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite o lado A: ");
        a = entrada.nextDouble();
        System.out.println("Digite o lado B: ");
        b = entrada.nextDouble();
        System.out.println("Digite o lado C: ");
        c = entrada.nextDouble();
        entrada.close();
        System.out.printf("=================== Medidas Selecionadas ===================\nLado A: %.2f cm\nLado B: %.2f cm\nLado C: %.2f cm\n======================== Resultado =========================\n",a,b,c);
        if ((a > b + c )||(b > a + c  ) || (c > a + b )){  
            System.out.println("Os lados Digitados não formam um triângulo.");
        }
        else{
            if(a==b && b==c){
                System.out.println("Todos os lados são iguais e formam um triângulo Equilátero.");
            }
            else{
                if(a==b || b==c || a==c){
                    System.out.println("Dois lados são iguais e formam um triângulo Isósceles.");
                }
                else{
                    System.out.println("Todos os Lados são diferentes e formam um triângulo Escaleno.");
                }
            }
        }
        System.out.println("============================================================");
    }
}

