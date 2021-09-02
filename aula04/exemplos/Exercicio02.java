package exemplos;

public class Exercicio02 {
    public static void main(String[] args) {
        int cont, soma;
        soma = 0;
        cont = 0;

        while(cont < 5){
            System.out.print(cont + " + ");
            soma += cont;
            cont++;
        }
        System.out.println(" = " + soma);
    }
}
