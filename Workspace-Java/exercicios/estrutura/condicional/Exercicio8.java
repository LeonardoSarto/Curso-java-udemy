package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double impostoDeRenda = 0;
        System.out.print("Digite o seu salario: ");
        double salario = teclado.nextDouble();

        if(salario >= 0 && salario <= 2000) {
            impostoDeRenda = 0;
        } else if(salario > 2000 && salario <= 3000) {
            impostoDeRenda = ((salario - 2000) * 8) / 100;
        } else if(salario > 3000 && salario <= 4500) {
            impostoDeRenda = ((salario - 3000) * 18) / 100;
            impostoDeRenda += (1000 * 8) / 100;
        } else if(salario > 4500) {
            impostoDeRenda = ((salario - 4500) * 28) / 100;
            impostoDeRenda += (1000 * 8) / 100;
            impostoDeRenda += (1500 * 18) / 100;
        } else {
            System.out.println("Valor inválido");
        }
        
        if(impostoDeRenda == 0) {
            System.out.println("Você está isento de imposto");
        } else {
            System.out.printf("Esse é o seu imposto: %.2f", impostoDeRenda);
        }

        teclado.close();
    }
}
