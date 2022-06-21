package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int x = teclado.nextInt();

        if(x >= 1 && x <= 1000) {
            for(int i = 0; i <= x; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Valor inválido");
        }

        teclado.close();
    }
}
