package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        int aluno, turma;

        mediaGeral = 0;
        for(turma = 1; turma <= 2; turma++){

            System.out.println("Turma: " + turma);
            
            mediaTurma = 0;
            for(aluno = 1; aluno <= 3; aluno++){

                System.out.printf("Digite a média do %d aluno: ", aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma += mediaAluno;
                 
            }
    
            mediaTurma /= 3;
            mediaGeral += mediaTurma;
            System.out.println("A média da turma: " + mediaTurma);
        }
        mediaGeral /= 2;
        System.out.println("A média da turma geral: " + mediaGeral);
        

        entrada.close();
    }
}
