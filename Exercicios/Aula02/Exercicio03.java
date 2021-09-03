import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento;

        System.out.println("Salário de um funcionário: ");
        salario = entrada.nextDouble();

        aumento = salario * 1.1035;

        System.out.println("Com aumento de 10,35%, o salário será: " + aumento);

        entrada.close();

    }
}
