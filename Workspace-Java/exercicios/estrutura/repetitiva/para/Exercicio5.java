package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para calcular seu fatorial: ");
        int n = teclado.nextInt();

        if(n == 0) {
            n = 1;
        } else {
            for(int i = n; i > 1; i--) {
                n = n * (i - 1);
            }
        }

        System.out.printf("\nO valor da fatorial é de: %d", n);
        teclado.close();
    }
}
