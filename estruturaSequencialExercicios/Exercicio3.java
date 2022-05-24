package estruturaSequencialExercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        int A, B, C, D, produtoDaDiferenca;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número");
        A = teclado.nextInt();
        System.out.println("Digite o valor do segundo número");
        B = teclado.nextInt();
        System.out.println("Digite o valor do terceiro número");
        C = teclado.nextInt();
        System.out.println("Digite o valor do quarto número");
        D = teclado.nextInt();

        produtoDaDiferenca = (A * B) - (C * D);

        System.out.println("O resultado do seu cálculo é: " + produtoDaDiferenca);
        teclado.close();
    }
}
