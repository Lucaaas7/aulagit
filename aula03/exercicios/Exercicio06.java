package exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        double nota = 7.5;

        if(nota >= 7.0){
            System.out.println("Aprovado");
        }
        else if(nota < 7.0 && nota >= 5){
            System.out.println("Exame");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
