package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = teclado.nextInt();

        if(n > 0) {
            for(int i = 1; i <= n; i++) {
                int quadrado = (int) Math.pow(i, 2), cubo = (int) Math.pow(i, 3);
                System.out.printf("%d %d %d\n", i, quadrado, cubo);
            }
        }
        teclado.close(); 
    }
}
