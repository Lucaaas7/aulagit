package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String[7];
        int i;

        for(i = 0; i < nome.length; i++){
            System.out.println("Digite nomes: ");
            nome[i] = entrada.nextLine();
        }

        for(i = nome.length - 1; i >= 0; i--){
           
            System.out.print(nome[i] + " ");
        }

        entrada.close();
    }
}
