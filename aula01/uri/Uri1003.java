package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        int A,B,soma;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        soma = A + B;
        System.out.println("SOMA = "+ soma);
        entrada.close();

    }
}
