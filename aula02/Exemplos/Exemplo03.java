package Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    
    public static void main(String[] args) {
     
      Scanner entrada = new Scanner(System.in);
      int idade, novaIdade;

      System.out.println("Digite a sua idade: ");
      idade = entrada.nextInt();
      
      novaIdade = idade + 10;
      System.out.println("daqui a 10 anos, vc terá: " + novaIdade);

      entrada.close();
    }
}
