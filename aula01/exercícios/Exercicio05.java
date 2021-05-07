package exercicíos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custo, custoFinal, distribuidor, impostos;
        System.out.println("Digite o custo de Fabricação do Veículo:");
        custo = entrada.nextDouble();
        distribuidor = 0.28 * custo;
        impostos = 0.45 * custo;
        custoFinal = custo + impostos + distribuidor;
        System.out.println("O Custo final do veículo é de: R$"+ custoFinal);
        System.out.println("O valor do Imposto a ser pago é de: R$" + impostos);
        System.out.println("O valor do Imposto + Distribuidor é de: R$"+(impostos+distribuidor));
        entrada.close();
    }
}
