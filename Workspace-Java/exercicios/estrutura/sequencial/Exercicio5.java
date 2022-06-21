package exercicios.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.ENGLISH);
        int codPeça1, codPeça2, quantPeça1, quantPeça2;
        double valorPeça1, valorPeça2, contaPeça1, contaPeça2, valorFinal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o código da primeira peça: ");
        codPeça1 = teclado.nextInt();
        System.out.println("Informe a quantidade de peças que irá comprar: ");
        quantPeça1 = teclado.nextInt();
        System.out.println("Informe o valor da primeira peça: ");
        valorPeça1 = teclado.nextDouble();

        System.out.println("Informe o código da segunda peça: ");
        codPeça2 = teclado.nextInt();
        System.out.println("Informe a quantidade de peças que irá comprar:");
        quantPeça2 = teclado.nextInt();
        System.out.println("Informe o valor da segunda peça:");
        valorPeça2 = teclado.nextDouble();

        contaPeça1 = quantPeça1 * valorPeça1;
        contaPeça2 = quantPeça2 * valorPeça2;
        valorFinal = contaPeça1 + contaPeça2;

        System.out.println("O código das duas peças são esses: " + codPeça1 + " e " + codPeça2);
        System.out.printf("A conta ficou em: R$ %.2f \n", valorFinal);

        teclado.close();
    }
}
