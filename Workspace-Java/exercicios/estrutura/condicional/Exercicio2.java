package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.println("Digite um número qualquer:");
        x = teclado.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        teclado.close();
    }
}
