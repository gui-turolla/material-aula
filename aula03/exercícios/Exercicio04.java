package exercícios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par=0,impar=0,media=0;
        for(int i =1; i<=10;i++){
            System.out.printf("Digite o %d° número: ",i);
            num = entrada.nextInt();
            if(num%2==0){
                media += num;
                par++;                
            }
            else{
                impar++;
            }
        }
        entrada.close();
        System.out.printf("A média dos valores pares é: %.2f\n",((float)media/par));
        System.out.printf("A porcentagem de números ímpares é de: %d%%",(impar*100 / 10));
    }
}