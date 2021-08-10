public class CaixaEletronico {
    public static void main(String[] args) {
        //Cédulas disponíveis no caixa eletrônico
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        //Quantidade total de cédulas entregues ao cliente
        int quantidadeTotal = 0;
        //Valor a ser sacado pelo cliente
        int valoresReais=987;

        //Percorrendo todas as cédulas disponíveis no caixa eletrônico
        for(int i = 0; i < cedulas.length; i++){
            int quantidadeCedulas = valoresReais/cedulas[i];
            //Impressão da quantidade de cédulas
            System.out.println("Quantidade de cédulas de " + cedulas[i] + ": " +quantidadeCedulas);
            //Resto da divisão
            valoresReais %= cedulas[i];
            //Quantidade total de cédulas entregues ao cliente
            quantidadeTotal += quantidadeCedulas;
        }
        // Impressão
        System.out.println("Quantidade total: "+quantidadeTotal);
    }
}
