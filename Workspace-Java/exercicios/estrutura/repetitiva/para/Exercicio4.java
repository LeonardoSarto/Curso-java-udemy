package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite a quantidade de pares: ");
        int n = teclado.nextInt();
        double x, y, resultadoDivisao;

        for(int i = 0; i < n; i++) {
            System.out.print("\nDigite o primeiro valor: ");
            x = teclado.nextDouble();

            System.out.print("\nDigite o segundo valor: ");
            y = teclado.nextDouble();

            if(y != 0) {
                resultadoDivisao = x / y;
                System.out.printf("\nO resultado da divisão é: %.1f\n", resultadoDivisao);
            } else {
                System.out.println("\nDivisão impossível");
            }
        }

        teclado.close();
    }   
}
