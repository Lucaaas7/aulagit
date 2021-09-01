package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String senha, senhaSalva;

        System.out.println("A senha: ");
        senha = entrada.nextLine();

        senhaSalva = "R10p5";

        if(senha.equals(senhaSalva)){
            System.out.println("Acesso concedido");
        }
        else{
            System.out.println("Acesso negado");
        }

        entrada.close();

    }
}
