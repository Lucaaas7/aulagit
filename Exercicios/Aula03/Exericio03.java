import java.util.Scanner;

/**
 * Exericio03
 */
public class Exericio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite 1º número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite 2º número: ");
        num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("Ordem não crescente: " + num1 + " e " + num2);
        }
        else{
            System.out.println("Ordem é " + num1 + " e " + num2 + ", então é crescente, portanto, é inválido!");
        }

        entrada.close();
    }
}