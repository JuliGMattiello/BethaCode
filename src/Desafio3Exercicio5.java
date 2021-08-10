//-------------------------------------------------------------
//5. Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.
//-------------------------------------------------------------

import java.util.Arrays;

public class Desafio3Exercicio5 {

    public static void main(String[] args) {
        int[] arrayInteiros = new int[10];
        int[] arrayInvertido = new int[arrayInteiros.length];

       for (int i = 10; i > 0; i--) {
            arrayInteiros[arrayInteiros.length - i] = i;  //Atribuição dos valores ao array
        }

        System.out.print("Array original: ");
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.print(+arrayInteiros[i] + " ");   // Imprime o array original
        }

        System.out.println();
        System.out.print("Array de números invertido: ");
        for (int i = 0; i < arrayInteiros.length; i++) {
            arrayInvertido[i] = arrayInteiros[(arrayInteiros.length - i) - 1];
            System.out.print(arrayInvertido[i] + " ");  // Imprime o array invertido
        }
    }
}
