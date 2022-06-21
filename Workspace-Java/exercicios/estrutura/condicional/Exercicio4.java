package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora que o jogo começou:");
        horaInicial = teclado.nextInt();
        System.out.println("Digite a hora que o jogo terminou:");
        horaFinal = teclado.nextInt();

        if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
        teclado.close();
    }
}
