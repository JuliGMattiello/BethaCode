//-------------------------------------------------------------
//4. Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de diálogo qual foi o dado passado.
//-------------------------------------------------------------

import javax.swing.JOptionPane;

public class Desafio3Exercicio4 {

    public static void main(String[] args){

        String texto;
        texto = JOptionPane.showInputDialog("Digite alguma coisa: ");
        String mensagem = "Você digitou: " +texto;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}