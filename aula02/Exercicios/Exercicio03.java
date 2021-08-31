package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner funcionario = new Scanner(System.in);
        double salario, reajuste, novoSalario;

        System.out.println("Qual é o salário do funcionário?");
        salario = funcionario.nextDouble();

        reajuste = 0.25;

        novoSalario = (salario * reajuste) + salario;

        System.out.println("Novo salário do funcionario: " + novoSalario);

        funcionario.close();

        
    }
}
