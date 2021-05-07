package exercícios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String response;
        System.out.println("Digite um valor para saber se é par: ");
        response = func(entrada.nextInt());
        entrada.close();
        System.out.println(response);
    }
    static String func (int valor){
        if (valor%2==0){
            return "O número: "+valor+" é par.";
        }
        else{
            return "O número: "+valor+" é ímpar.";
        }
    }
}
