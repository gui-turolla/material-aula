package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores, positivos=0,pares=0,negativos=0;
        for(int i=0;i <5;i++){
            valores = entrada.nextInt();
            if(valores%2==0){
                pares++;
            }
            if(valores>0){
                positivos++;
            }
            if (valores < 0){
                negativos++;
            }
        }
        entrada.close();
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",pares,(5-pares),positivos,negativos);
    }
}
