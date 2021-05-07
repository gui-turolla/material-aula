package exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {
   public static void main(String[] args) {
        ArrayList<Integer> entradas = new ArrayList<>();
        int result;
        Scanner entrada = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.printf("Digite o %d° número: ",i);
            entradas.add(entrada.nextInt());
        }
        entrada.close();
        result = order(entradas.get(0),entradas.get(1),entradas.get(2));
        System.out.println("O menor valor digitado é: "+result);
    } 

   public static int order(int num1, int num2, int num3){
        if(num1 <= num2 && num1 <= num3){
            return num1;
        }
        else{
            if(num2 <= num1 && num2 <= num3){
                return num2;
            }
            else{
                return num3;
            }
        }   
   }
}
