package exercicios.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x, y;

        do {
            System.out.print("Digite a coordenada x: ");
            x = teclado.nextInt();

            System.out.print("Digite a coordenada y: ");
            y = teclado.nextInt();

            if(x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if(x < 0 && y > 0) {
                System.out.println("segundo");
            } else if(x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if(x > 0 && y < 0) {
                System.out.println("quarto");
            }

        } while (x != 0 && y != 0);
        teclado.close();
    }
}