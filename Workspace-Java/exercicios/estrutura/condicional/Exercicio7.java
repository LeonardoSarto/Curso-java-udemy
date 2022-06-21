package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double X, Y;
        System.out.print("Digite a coordenada x: ");
        X = teclado.nextDouble();
        System.out.print("Digite a coordenada y: ");
        Y = teclado.nextDouble();

        if(X == 0 && Y != 0) {
            System.out.println("Eixo y");
        } else if(Y == 0 && X != 0) {
            System.out.println("Eixo x");
        } else if(X == Y && X == 0) {
            System.out.println("Origem");
        } else if(X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if(X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if(X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if(X > 0 && Y < 0) {
            System.out.println("Q4");
        }
        teclado.close();
    }
}
