import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, i = 1, seq;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        System.out.printf("1, ");
        while(i <= num){
            seq = i + i;
            if(seq <= (num / 2)){
                System.out.printf("%d, ", seq);
            }
            else if(seq <= num){
                System.out.printf("%d", seq);
            }
            i = seq;
        }

        entrada.close();
    }
}
