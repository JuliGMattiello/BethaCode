//-------------------------------------------------------------
//2. Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
//-------------------------------------------------------------

public class Desafio3Exercicio2 {

    public static void main(String[] args) {
        int[] arrayNumeros = {07, 19, 65, 98, 03, 25, 47, 37, 14, 75}; //Declaração do array
        int soma = 0;
        float media = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            soma = soma + arrayNumeros[i];
        }

        media = (soma / arrayNumeros.length);

        System.out.println("Soma: " +soma);  // Imprime a soma
        System.out.println("Média: " +media);  // Imprime a média
    }
}
