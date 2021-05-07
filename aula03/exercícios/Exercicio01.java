package exercícios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,i=1;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        entrada.close();
        while(i <= num){
            if(i != num){
                if(i * 2 >= num && i*2 != num){
                    System.out.printf(" %d",i);
                }
                else{
                    System.out.printf("%d, ",i);
                }         
            }
            else{
                System.out.printf(" %d",i);    
            }
            i*=2;
        }
    }
}