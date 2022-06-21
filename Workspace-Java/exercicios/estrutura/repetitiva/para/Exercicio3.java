package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de casos de teste: ");
        int n = teclado.nextInt();
        double x, y, z, mediaPonderada;

        for(int i = 0; i < n; i++) {
            System.out.print("\nDigite o primeiro valor: ");
            x = teclado.nextDouble();

            System.out.print("\nDigite o segundo valor: ");
            y = teclado.nextDouble();

            System.out.print("\nDigite o terceiro valor: ");
            z = teclado.nextDouble();

            mediaPonderada = (x * 2 + y * 3 + z * 5) / 10;

            System.out.printf("\nA média ponderada é de: %.1f\n", mediaPonderada);
        }

        teclado.close();
    }
}
