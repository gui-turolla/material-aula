package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        int A,B,PROD;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        PROD = A * B;
        System.out.println("PROD = "+PROD);
    entrada.close();
    }

}
