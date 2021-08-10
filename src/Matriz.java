public class Matriz {
    public static void main(String[] args)
    {
        double matriz[][] = new double[4][4]; // Declaração e construção da matriz
        for(int i = 0; i < matriz.length; i++) //Percorre a matriz no eixo i
        {
            for(int j = 0; j < matriz[i].length; j++) //Percorre a matriz no eixo j
            {
                matriz[i][j] = i*j; //Atribui o valor a célula
            }
        }

        for(int i = 0; i < matriz.length; i++) //Percorre a matriz no eixo i
        {
            for(int j = 0; j < matriz[i].length; j++) //Percorre a matriz no eixo j
            {
                //Imprime o resultado
                System.out.println("Valor da posição[" +i+", "+j+"]: " + matriz[i][j]);
            }
        }
    }
}
