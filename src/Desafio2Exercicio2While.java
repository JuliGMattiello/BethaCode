//-------------------------------------------------------------
//2. Escreva um laço while que execute 20 vezes, imprimindo o valor da variável x que inicialmente está com valor 10.
//-------------------------------------------------------------

public class Desafio2Exercicio2While {
    public static void main(String[] args){

        int x = 10;
        int y = 1;

        while (y <= 20) {
            System.out.println("Valor do x = " + x);
            x++;
            y++;
        }
    }
}
