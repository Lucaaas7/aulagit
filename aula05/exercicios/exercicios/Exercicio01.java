package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, i, maior;

        System.out.println("Digite o número: ");
        maior = entrada.nextInt();

       for(i = 0; i < 9; i++){
           
            System.out.printf("Digite %dº número: ", i);
            num = entrada.nextInt();
            
            if(maior < num){
                maior = num;
            }
       }
       System.out.println("O maior número digitado: " + maior);

        entrada.close();

    }
    
}