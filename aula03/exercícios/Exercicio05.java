package exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> mediaTurmaGeral = new ArrayList<>();
        double notaAluno, mediaTurma=0, mediaGeral=0;
        final int NUMERO_ALUNOS=20, NUMERO_TURMAS=5;
        for(int i = 1; i<=NUMERO_TURMAS;i++){
            for(int a = 1; a<=NUMERO_ALUNOS; a++){
                System.out.printf("Digite a média do Aluno %d da Turma %d: ",a,i);
                notaAluno = entrada.nextDouble();
                mediaTurma += notaAluno;
            }
            mediaTurmaGeral.add(""+mediaTurma/NUMERO_ALUNOS);
            mediaGeral += (mediaTurma/NUMERO_ALUNOS);
            mediaTurma = 0;
            System.out.println("--------------------------------------------");
        }
        entrada.close();
        for(int b =0; b <5; b++){
            System.out.printf("Média da Turma %d : %s\n",(b+1),mediaTurmaGeral.get(b));
        }
        System.out.printf("A média Geral das Turmas é de: %.2f",mediaGeral/NUMERO_TURMAS);
    }
}