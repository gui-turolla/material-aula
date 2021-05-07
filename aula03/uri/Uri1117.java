package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1=-1,nota2=-1,media=0;
        while(true){
            nota1 = entrada.nextDouble();
            if(nota1>=0 && nota1<=10) {
                break;
            }
            System.out.println("nota invalida");        
        }
        while(true){
            nota2 = entrada.nextDouble();
            if(nota2>=0 && nota2<=10) {
                break;
            }
            System.out.println("nota invalida");
        }
        entrada.close();
        media = (nota1+nota2)/2;
        System.out.printf("media = %.2f\n",media);
    }
}
