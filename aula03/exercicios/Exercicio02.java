package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        nota1 = 7 * 0.4;
        nota2 = 5 * 0.6;
        media = nota1 + nota2;

        if(media >= 6.0){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado");
        }
        System.out.println("Fim do programa!");
    }
}
