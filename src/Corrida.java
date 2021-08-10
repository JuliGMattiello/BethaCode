public class Corrida{

    public static void main(String[] args){
        //Criação dos carros que irão correr
        CarroCorrida carroEquipeVelocidade = new CarroCorrida();
        CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

        //Criação dos pilotos de cada equipe
        Piloto pilotoEquipeVelocidade = new Piloto();
        Piloto pilotoEquipeTrapaceiros = new Piloto();

        //Atributos do piloto da equipe velocidade
        pilotoEquipeVelocidade.nome = "Piloto 1";
        pilotoEquipeVelocidade.idade = 25;
        pilotoEquipeVelocidade.habilidade = 75;

        //Atributos do piloto da equipe trapaceiros
        pilotoEquipeTrapaceiros.nome = "Piloto 2";
        pilotoEquipeTrapaceiros.idade = 27;
        pilotoEquipeTrapaceiros.habilidade = 65;

        //Os pilotos são colocados em seus carros
        carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
        carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

        //Identificação dos carros
        carroEquipeVelocidade.numeroIdentificacao = 1;
        carroEquipeTrapaceiros.numeroIdentificacao = 2;

        //Carros são ligados
        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiros.ligar();

        //Inicio da corrida
        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.velocidadeAtual = 200.0;

        System.out.println("Velocidade atual da Equipe Velocidade: " +carroEquipeVelocidade.velocidadeAtual);
        System.out.println("Velocidade atual da Equipe Trapaceiros: " +carroEquipeTrapaceiros.velocidadeAtual);
    }

    static class Piloto {
        String nome;
        Integer habilidade;
        Integer idade;
    }

    static class CarroCorrida{
        //Estado
        Integer numeroIdentificacao;
        Double velocidadeAtual = 0.0;
        Double velocidadeMaxima = 100.0;
        Piloto piloto;

        //Comportamento
        void ligar()
        {
            System.out.println("VRUUUUUUMmmmmmmmm");
        }

        void desligar()
        {
            System.out.println("MMMmmmmmmmmm");
        }

        void acelerar()
        {
            velocidadeAtual += 10 + piloto.habilidade*0.1;
            if(velocidadeAtual > velocidadeMaxima)
            {
                velocidadeAtual = velocidadeMaxima;
            }
        }

        void frear (Integer intensidadeFreada)
        {
            if(intensidadeFreada > 100)
            {
                intensidadeFreada = 100;
            }else if(intensidadeFreada < 0)
            {
                intensidadeFreada = 0;
            }

            velocidadeAtual -= intensidadeFreada*0.25;

            if(velocidadeAtual < 0)
            {
                velocidadeAtual = 0.0;
            }
        }
    }
}