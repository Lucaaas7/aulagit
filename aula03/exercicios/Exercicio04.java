package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salariobruto, prestacao, emprestimo;

        System.out.println("Qual é o teu salário bruto? ");
        salariobruto = entrada.nextDouble();
        System.out.println("Qual é o valor máximo de prestação? ");
        prestacao = entrada.nextDouble();

        emprestimo = 0.3 * salariobruto;

        if(prestacao >= emprestimo){
            System.out.println("Emprestimo não pode conceder");
        }
        else{
            System.out.println("Emprestimo pode conceder!");
        }

        System.out.println("Fim do programa");

        entrada.close();
    }
}
