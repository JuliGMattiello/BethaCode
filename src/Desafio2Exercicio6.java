//-------------------------------------------------------------
//6. Faça um programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.
//-------------------------------------------------------------

public class Desafio2Exercicio6 {
    public static void main(String[] args) {

        for (int x = 15; x <= 35; x++) {
            if (x % 2 != 0) {
                int y = 0;
                y = (x * x);
                System.out.println(x + " é um número ímpar e o seu quadrado é " + y);
            } else {		//retirando esse else, não imprime os números pares
                System.out.println(x + " é um número par");
            }
        }
    }
}
