package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cedula,cem,cinquenta,vinte,dez,cinco,dois,um;
        cedula = entrada.nextInt();
            if (cedula % 100 == 0){
                cem = cedula / 100;
                cinquenta = vinte = dez = cinco = dois = um = 0;
            }
            else{
               cem = cedula / 100;
               cinquenta = (cedula % 100)/50;
               vinte = (cedula % 100 % 50)/20;
               dez = (cedula % 100 % 50 % 20)/10;
               cinco = (cedula % 100 % 50 % 20 % 10)/5;
               dois = (cedula % 100 % 50 % 20 % 10 % 5)/2;
               um = (cedula % 100 % 50 % 20 % 10 % 5 % 2) /1;        
            }
            System.out.printf("%d\n",cedula);
            System.out.printf("%d nota(s) de R$ 100,00\n",cem);
            System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
            System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
            System.out.printf("%d nota(s) de R$ 10,00\n",dez);
            System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
            System.out.printf("%d nota(s) de R$ 2,00\n",dois);
            System.out.printf("%d nota(s) de R$ 1,00\n",um);    
        entrada.close();
    }
}
