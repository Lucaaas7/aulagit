import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, desc;

        System.out.println("O salário: ");
        salario = entrada.nextDouble();

        if(salario <= 600.00){
            System.out.println("Isento!");
        }
        else if(salario > 600.00 && salario <= 1200.00){
            desc = salario * 0.8;
            System.out.println("Salário líquido após 20% de desconto do INSS: " + desc);
        }
        else if(salario > 1200.00 && salario <= 2000.00){
            desc = salario * 0.75;
            System.out.println("Salário líquido após 25% de desconto do INSS: " + desc);
        }
        else{
            desc = salario * 0.7;
            System.out.println("Salário líquido após 30% de desconto do INSS: " + desc);
        }

        entrada.close();
    }
}
