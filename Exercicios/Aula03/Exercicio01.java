import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double div;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if(num > 20){
            div = num / 2.0;
            System.out.println("A metade do número digitado: " + div);
        }
        System.out.println("Fim do Programa!");

        entrada.close();

    }
}