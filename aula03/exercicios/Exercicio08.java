package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Digite três números para a, b e c: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        soma = b + c;
        if(a > soma){
            System.out.println("Não formam triangulo!");
        }
        else if(a == b && b == c && a == c){
            System.out.println("Formam um triangulo equilatero");
        }
        else if(a == b || b == c || a == c){
            System.out.println("Formam um triangulo isosceles");
        }
        else{
            System.out.println("Formam um triangulo escaleno");
        }
        entrada.close();
    }
}
