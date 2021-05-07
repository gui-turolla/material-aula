package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean validar = true;

        while (validar == true){
            try{
                System.out.print("Digite um número: ");
                numero = Integer.parseInt(entrada.nextLine());
                System.out.println("Você digitou " + numero);
                validar = false; 
            } catch(InputMismatchException | NumberFormatException ex){
                System.out.println("Valor inválido!");
            } catch( Exception ex){
                System.out.println("Erro desconhecido!");
            }
        }

        entrada.close();
    }
}