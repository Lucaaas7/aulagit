import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tab, i, num;

        System.out.println("Digite um número da tabuada: ");
        num = entrada.nextInt();

        for(i = 0; i <= 10; i++){

            tab = num * i;
            System.out.printf("%d x %d = %d\n", num, i, tab);
        }

        entrada.close();
    }
}
