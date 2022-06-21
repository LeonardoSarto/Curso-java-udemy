package exercicios.estrutura.repetitiva.para;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int n = teclado.nextInt(), dentroDoIntervalo = 0, foraDoIntervalo = 0;
        
        for(int i = 0; i < n; i++) {
            System.out.print("\nDigite um número inteiro: ");
            int x = teclado.nextInt();

            if(x >= 10 && x <= 20) {
                dentroDoIntervalo++;
            } else {
                foraDoIntervalo++;
            }
        }

        System.out.printf("\n%d in\n", dentroDoIntervalo);
        System.out.printf("%d out", foraDoIntervalo);
        teclado.close();
    }
}
