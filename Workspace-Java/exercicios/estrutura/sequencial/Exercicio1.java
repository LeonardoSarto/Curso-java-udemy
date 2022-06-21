package exercicios.estrutura.sequencial;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String args[]) {
        int x, y, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        x = teclado.nextInt();
        System.out.println("Digite o primeiro número");
        y = teclado.nextInt();
        soma = x + y;

        System.out.println("O resultado da soma é: " + soma);
        teclado.close();
    }
}