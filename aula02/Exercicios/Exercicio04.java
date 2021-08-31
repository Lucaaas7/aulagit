package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        double kw, min, desc, qtd, pagar;

        System.out.println("Qual é o salário minimo?");
        min = salario.nextDouble();

        System.out.println("Quanto foi total de kw?");
        qtd = salario.nextDouble();

        kw = 0.002 * min;
        System.out.println("Quanto é $ de um kw: " + kw);

        pagar = kw *  qtd;
        System.out.println("Quanto deve pagar na residencia: " + pagar);

        desc = pagar - (pagar * 0.15);
        System.out.println("Quanto é $ com desconto: " + desc);


        salario.close();

    }
}
