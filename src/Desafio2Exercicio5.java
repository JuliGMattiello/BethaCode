//-------------------------------------------------------------
//5. Implemente um programa para calcular a área de um trapézio, onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2
//-------------------------------------------------------------

import java.util.Scanner;

public class Desafio2Exercicio5 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Informe a altura do trapézio: ");
        float h = s.nextFloat();
        System.out.print("Informe a base menor do trapézio: ");
        float b = s.nextFloat();
        System.out.print("Informe a base maior do trapézio: ");
        float B = s.nextFloat();

        float area = 0;
        if (b < B){
            //Fórmula: Área = (h.(b+B))/2
            area = (h*(b+B))/2;
            System.out.println("Área do trapézio: " + area);
        }else {
            System.out.println("Valores das bases não conferem!");
        }
    }
}