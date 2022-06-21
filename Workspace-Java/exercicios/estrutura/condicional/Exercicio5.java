package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int codItem, quantItem;
        double valorConta = 0;

        System.out.println("-------------");
        System.out.println("CARDÁPIO");
        System.out.println("-------------");
        System.out.println("1 - Cachorro Quente - R$ 4.00");
        System.out.println("2 - X-Salada - R$ 4.50");
        System.out.println("3 - X-Bacon - R$ 5.00");
        System.out.println("4 - Torrada Simples - R$ 2.00");
        System.out.println("5 - Refrigerante - R$ 1.50");
        System.out.println("Digite o código do item desejado");
        codItem = teclado.nextInt();

        System.out.println("Digite a quantidade desejada");
        quantItem = teclado.nextInt();

        if(codItem == 1) {
            valorConta = quantItem * 4.00;
        } else if(codItem == 2) {
            valorConta = quantItem * 4.50;
        } else if(codItem == 3) {
            valorConta = quantItem * 5.00;
        } else if(codItem == 4) {
            valorConta = quantItem * 2.00;
        } else if(codItem == 5) {
            valorConta = quantItem * 1.50;
        } else {
            System.out.println("Esse item não existe!");
        }

        System.out.printf("O valor da conta ficou: R$%.2f", valorConta);

        teclado.close();
    }
}
