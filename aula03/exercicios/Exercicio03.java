package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2;

        System.out.println("Um numero a digitar: ");
        num1 = entrada.nextFloat();

        System.out.println("Outro numero a digitar: ");
        num2 = entrada.nextFloat();

        if(num1 < num2){
            System.out.println("Ordem: " + num1 + "\n" + num2);        
        }
        else{
            System.out.println("Ordem invalida!");
        }       
        entrada.close();
    }
}
