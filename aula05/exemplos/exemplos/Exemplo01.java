package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota[] = new double[5];
        int i;

        for(i = 0; i < nota.length; i++){
            System.out.printf("Digite a %d nota: ", i+1);
            nota[i] = entrada.nextInt();
        }

        for(i = 0; i < nota.length; i++){
            System.out.printf("Nota[%d] = %.2f\n", i, nota[i]);
        }

        entrada.close();
    }
}
