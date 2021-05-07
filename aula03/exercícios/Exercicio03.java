package exercícios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,par=0,impar=0;
        for(int i =1; i <=10; i++){
            System.out.printf("Digite o %d° número: ",i);
            num = entrada.nextInt();
            if(num%2==0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("O total de pares é: "+par);
        System.out.println("O total de ímpares é: "+impar);
        entrada.close();
    }
}
