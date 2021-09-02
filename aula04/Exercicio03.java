import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, cont = 1, num = 0;

        System.out.println("Digite um numero ");
        n = entrada.nextInt();

        while(cont <= n){
            System.out.print(" " + cont);
            cont *= 2;
        }
        entrada.close();
        
    }
}
