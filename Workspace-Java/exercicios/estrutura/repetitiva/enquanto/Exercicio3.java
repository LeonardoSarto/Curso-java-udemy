package exercicios.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int combustivelAbastecido, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("----------------------------");
        System.out.println("MENU DE TIPO DE COMBUSTÍVEL");
        System.out.println("1. Àlcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        System.out.println("----------------------------");

        do {
            System.out.print("\nDigite o combustível abastecido, conforme o menu acima: ");
            combustivelAbastecido = teclado.nextInt();

            if(combustivelAbastecido == 1) {
                alcool += 1;
            } else if(combustivelAbastecido == 2) {
                gasolina += 1;
            } else if(combustivelAbastecido == 3) {
                diesel += 1;
            } else if(combustivelAbastecido != 4) {
                System.out.println("Valor inválido");
            }

        } while (combustivelAbastecido != 4);

        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Àlcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        teclado.close();
    }
}