import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tab, cont, num;
        cont = 0;

        System.out.println("Qual número desejado para ver a tabuada?");
        num = entrada.nextInt();

        while(cont <= 10){
            tab = num * cont;
            System.out.println(num + " x " + cont + " = " + tab);
            cont++;
        }


        entrada.close();
    }
}
