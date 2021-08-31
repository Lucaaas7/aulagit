package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        //entrada de dados
        System.out.println("Qual foi nota 1?");
        nota1 = entrada.nextDouble();
        System.out.println("Qual foi nota 2?");
        nota2 = entrada.nextDouble();

        //processamento
        media = (nota1 + nota2) / 2;

        //saida
        System.out.println("Resultado: " + media);

        entrada.close();

    }
}
