import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Nota 1 de aluno Lucas: ");
        nota1 = teclado.nextDouble();
        System.out.println("Nota 2 de aluno Lucas: ");
        nota2 = teclado.nextDouble();
        

        media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno Lucas: " + media);
        
        teclado.close();
    }
}
