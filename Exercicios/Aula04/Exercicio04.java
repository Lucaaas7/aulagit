import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma = 0, i = 1;

        System.out.printf("Digite o %dº número: ", i);
        num = entrada.nextInt();
        
        soma += num;
        while(num != 0){
            System.out.printf("Digite o %dº número: ", i+1);
            num = entrada.nextInt();
            
            soma += num;
            i++;
        }
        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
}
