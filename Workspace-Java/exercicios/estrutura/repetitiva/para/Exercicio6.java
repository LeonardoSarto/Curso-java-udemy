package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro para descobrir seus divisores: ");
        int n = teclado.nextInt();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.printf("\n%d", i);
            }
        }
        teclado.close();
    }
}
