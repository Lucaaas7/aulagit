import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i, par = 0, impar = 0;

        for(i = 1; i <= 10; i++){
            System.out.printf("Digite %dº numero: ", i);
            num = teclado.nextInt();

            if(num % 2 == 0){
                par ++;
            }
            else{
                impar++;
            }
        }
        System.out.println("o total de pares é " + par);
        System.out.println("O total de impares é " + impar);

        teclado.close();
    }
}
