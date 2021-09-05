package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota[] = new double[10], mediaTurma = 0;
        int aluno, acimaMedia = 0;

        for(aluno = 0; aluno < nota.length; aluno++){
            System.out.printf("Digite nota de %d aluno: ", aluno + 1);
            nota[aluno] = entrada.nextDouble();

           

            mediaTurma += nota[aluno];
        }
        for(aluno = 0; aluno < nota.length; aluno++){
            System.out.printf("Nota de %d aluno: %.2f\n ", aluno+1, nota[aluno]);
        }

        mediaTurma /= nota.length;
        System.out.println("Media da turma: " + mediaTurma);

        for(aluno = 0; aluno < nota.length; aluno++){
            if(nota[aluno] > mediaTurma){
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de notas acima da média da turma: " + acimaMedia);

        entrada.close();
    }
}
