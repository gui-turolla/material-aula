package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        String entrada1, entrada2;
        double soma;
        Scanner entrada = new Scanner(System.in);
        entrada1 = entrada.nextLine();
        entrada2 = entrada.nextLine();
        String[] string1 = entrada1.split(" ");
        String[] string2 = entrada2.split(" ");
        soma = (Double.parseDouble(string1[1]) * Double.parseDouble(string1[2])) + (Double.parseDouble(string2[1]) * Double.parseDouble(string2[2]));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",soma);
        entrada.close();

    }
}
