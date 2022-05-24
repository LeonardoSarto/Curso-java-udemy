package estruturaSequencialExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.ENGLISH);
        int numFuncionario, horasTrabalhadas;
        double salario, resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        numFuncionario = teclado.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = teclado.nextInt();
        System.out.println("Digite o valor que recebe por hora:");
        salario = teclado.nextDouble();

        resultado = horasTrabalhadas * salario;

        System.out.println("O seu número de funcionário é: " + numFuncionario);
        System.out.printf("Você irá receber neste mês: U$ %.2f ", resultado);
        teclado.close();
    }
}
