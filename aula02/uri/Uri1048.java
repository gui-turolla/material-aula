package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        double salario,newSalario,reajuste;
        Scanner entrada = new Scanner(System.in);
        salario = entrada.nextDouble();
        entrada.close();
        if(salario >=0 && salario<=400){
            newSalario = salario * 1.15;
            reajuste = salario *0.15;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", newSalario,reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else{
            if(salario>=400.01 && salario<=800){
                newSalario = salario * 1.12;
                reajuste = salario * 0.12;
                System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", newSalario,reajuste);
                System.out.println("Em percentual: 12 %");
            }
            else{
                if(salario >=800.01 && salario <=1200){
                    newSalario = salario * 1.1;
                    reajuste = salario * 0.1;                
                    System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", newSalario,reajuste);
                    System.out.println("Em percentual: 10 %");
                }
                else{
                    if(salario>=1200.01 && salario <=2000){
                        newSalario = salario * 1.07;
                        reajuste = salario * 0.07;
                        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", newSalario,reajuste);
                        System.out.println("Em percentual: 7 %");
                    }
                    else{
                        if(salario > 2000){
                            newSalario = salario * 1.04;
                            reajuste = salario * 0.04;
                            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", newSalario,reajuste);
                            System.out.println("Em percentual: 4 %");
                        }
                    }
                }
            }            
        }        
    }
}
