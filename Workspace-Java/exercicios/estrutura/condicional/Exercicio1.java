package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.println("Digite um número qualquer:");
        x = teclado.nextInt();
        
        if(x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        teclado.close();
    }
}
