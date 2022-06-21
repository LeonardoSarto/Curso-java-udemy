package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite um valor qualquer");
        double A = teclado.nextDouble();

        if(A < 0.0 && A > 100.0) {
            System.out.println("Fora do intervalo");
        } else if(A <= 25.0) {
            System.out.println("O número digitado encontra-se no intervalo entre 0 e 25");
        } else if(A <= 50.0) {
            System.out.println("O número digitado encontra-se no intervalo entre 25 e 50");
        } else if(A <= 75.0) {
            System.out.println("O número digitado encontra-se no intervalo entre 50 e 75");
        } else if(A <= 100) {
            System.out.println("O número digitado encontra-se no intervalo entre 75 e 100");
        }
        teclado.close();
    }
}
