//-------------------------------------------------------------
//4. Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número.
//-------------------------------------------------------------

import java.util.Scanner;

public class Desafio2Exercicio4 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro com até 4 dígitos: ");
        int num = s.nextInt(); //lê um inteiro

        if (num < 9999){
            String toReverse = String.valueOf(num); // converte inteiro para string
            char[] chars = toReverse.toCharArray();
            for (int i = chars.length-1; i>=0; i--){
                System.out.print(chars[i]);
            }
        }else {
            System.out.println("Número inválido");
        }
    }
}
