public class OrientacaoMain {

    public static void main(String[] args){

        Documento documento1;   //Declaração do objeto documento1
        documento1 = new Documento();   //Criação do objeto documento1

        //Atribuição dos valores para o documento1
        documento1.codigo = 123456;
        documento1.nome = "Alfredo";
        documento1.foto = "Img1.png";
        documento1.dataNascimento = "20/05/1990";

        System.out.println("Código do documento: " + documento1.nome);
    }

    static class Documento{
        //Estado
        String foto;    //Nome do arquivo de imagem
        String nome;    //Nome da pessoa
        Integer codigo; // Código deste documento
        String dataNascimento; //Data de nascimento
    }
}
