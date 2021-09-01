package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, desc;

        System.out.println("Salário: ");
        salario = entrada.nextDouble();

        if(salario <= 600.00){
            System.out.println("Isento!");
        }
        else if(salario > 600.00 && salario <= 1200.00){
            desc = salario - (salario * 0.2) ;
            System.out.println("Salario com desconto do INSS 20%: " + desc);
        }
        else if(salario > 1200.00 && salario <= 2000.00){
            desc =  salario - (salario * 0.25);
            System.out.println("Salario com desconto do INSS 25%: " + desc);
        }
        else{
            desc = salario - (salario * 0.3) ;
            System.out.println("Salario com desconto do INSS 30%: " + desc);
        }

        entrada.close();
    }
}
