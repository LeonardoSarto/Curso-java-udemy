package exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.ENGLISH);
        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A =teclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        B =teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        C= teclado.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = 3.14159 * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("Área do triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Área do circulo: %.3f\n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f\n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Área do retângulo: %.3f\n", areaRetangulo);
        
        teclado.close();
    }
}
