package estruturaSequencialExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]) {
        double raio, area;
        Locale.setDefault(Locale.ENGLISH);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = teclado.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A área do seu círculo é de: %.4f", area);

        teclado.close();
    }
}