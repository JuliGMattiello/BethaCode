//-------------------------------------------------------------
//3. Faça um programa que inverta as posições de um array com 10 elementos.
//-------------------------------------------------------------

public class Desafio3Exercicio3 {

    public static void main(String[] args) {
        int[] arrayNumeros = {07, 19, 65, 98, 03, 25, 47, 37, 14, 75}; //Declaração do array
        int[] arrayInvertido = new int[arrayNumeros.length];

        System.out.print("Array de números: ");

        for(int i = 0; i < arrayNumeros.length; i++){
            System.out.print(arrayNumeros[i] + " ");  // Imprime o array original
        }

        System.out.println();
        System.out.print("Array de números invertido: ");
        for (int i = 0; i < arrayNumeros.length; i++) {
           arrayInvertido[i] = arrayNumeros[(arrayNumeros.length - i) - 1];
           System.out.print(arrayInvertido[i] + " ");  // Imprime o array invertido
        }
    }
}
