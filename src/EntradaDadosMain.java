import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma linha: ");
        String linha = s.nextLine(); // lê a linha
        System.out.print("Digite um número: ");
        int i = s.nextInt(); //lê um inteiro
        System.out.print("Digite um número: ");
        double d = s.nextDouble(); //lê um ponto flutuante

        System.out.println("Imprime: linha: " + linha + " inteiro: "+ i + " double " + d);
    }
}