package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o primeiro número: ");
        A = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        B = teclado.nextInt();

        if(A % B == 0) {
            System.out.println("SAO MULTIPLOS");
        } else if(B % A == 0) {
            System.out.println("SAO MULTIPLOS");
        } else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        teclado.close();
    }
}
