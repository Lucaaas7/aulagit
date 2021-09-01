package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        double numero, divisao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = entrada.nextDouble();

        if(numero > 20){
            divisao = numero / 2;
            System.out.println("Olhe a metade do número digitado: " + divisao);
        }

        System.out.println("Final do programa");

        entrada.close();
    }
}
