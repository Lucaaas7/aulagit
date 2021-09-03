import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao, emprestimo;

        System.out.println("O salário bruto: ");
        salarioBruto = entrada.nextDouble();
        System.out.println("O valor máximo de prestação: ");
        prestacao = entrada.nextDouble();

        emprestimo = 0.3 * salarioBruto;

        if(prestacao > emprestimo){
            System.out.println("O empréstimo não pode conceder.");
        }
        else{
            System.out.println("Boa notícia! O empréstimo pode conceder!");
        }
        entrada.close();
    }
}
