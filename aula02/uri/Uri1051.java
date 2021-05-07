package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario,tributavel,tributavel2,tributavel3,tributavel4;
        salario = entrada.nextDouble();
        entrada.close();
        if(salario >=0 && salario <=2000){
            System.out.println("Isento");
        }
        else{
            if(salario>=2000.01 && salario<=3000){
                tributavel = salario - 2000;
                System.out.printf("R$ %.2f\n",(double)tributavel*0.08);
            }
            else{
                if(salario >=3000.01 && salario <=4500){
                    tributavel = salario - 2000;
                    tributavel2 = tributavel - 1000 ;
                    tributavel3= tributavel - tributavel2;
                    System.out.printf("R$ %.2f\n",(double)((tributavel2*0.18)+(tributavel3*0.08)));
                }
                else{
                    if(salario >4500){
                    tributavel = salario - 2000;
                    tributavel2 = 1000;
                    tributavel3 = 1500;
                    tributavel4 = tributavel - 2500;
                    System.out.printf("R$ %.2f\n",(double)((tributavel4*0.28)+(tributavel2*0.08)+(tributavel3*0.18)));
                    }
                }
            }
        }
    }
}
