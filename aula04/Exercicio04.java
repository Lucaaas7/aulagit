import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 1, soma = 0, cont = 1;

        while(num != 0){
            System.out.printf("Digite o %dº numero ", cont++);
            num = entrada.nextInt();
            soma += num;
        }

        System.out.println("soma dos valores = " + soma);
        
        entrada.close();
    }
}
