import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par = 0, impar = 0, i;

        for(i = 0; i < 10; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            num = entrada.nextInt();

            if(num % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("O total de pares é: " + par);
        System.out.println("O total de impares é: " + impar);

        entrada.close();
    }
}
