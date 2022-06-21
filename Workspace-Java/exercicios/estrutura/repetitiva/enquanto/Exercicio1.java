package exercicios.estrutura.repetitiva.enquanto;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite uma senha: ");
            senha = teclado.nextInt();

            if(senha != 2002) {
                System.out.println("Senha invalida");
            } else {
                System.out.println("Acesso permitido");
            }
        } while (senha != 2002);
        teclado.close();
    }
}