public class ControleFluxoWhileDWhileMain {
    public static void main(String[] args) {
        //exemplo com while - somente realiza a ação se a condição for verdadeira
        int x = 10;
        while (x < 10) {
            System.out.println("item x " + x);
            x++;
        }

        // exemplo com do-while - realiza a ação e depois testa a condição
        int y = 10;
        do {
            System.out.println("item y " + y);
            y++;
        } while(y < 10);
    }
}
