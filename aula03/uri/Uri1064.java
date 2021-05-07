package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valores, media =0;
        int calc =0;
        for (int i = 0; i<6;i++){
            valores = entrada.nextDouble();
            if(valores>0){
                calc++;
                media += valores;
            }
        }
 
        System.out.printf("%d valores positivos\n%.1f\n",calc,(media/calc));
        entrada.close();
    }
}
