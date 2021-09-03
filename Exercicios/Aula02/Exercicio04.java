import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, kW, conta, desc;
        int qtd;

        System.out.println("Salário mínimo: ");
        salarioMin = entrada.nextDouble();
        System.out.println("Quantidade de kw consumida: ");
        qtd = entrada.nextInt();

        kW = salarioMin / 500;
        conta = kW * qtd;
        desc = conta * 0.85;

        System.out.println("Valor, em reais, de cada quilowatt: " + kW);
        System.out.println("Valor, em reais, a ser pago por essa residência: " + conta);
        System.out.println("Valor, em reais, a ser pago com desconto de 15%: " + desc);

        entrada.close();
    }
}
