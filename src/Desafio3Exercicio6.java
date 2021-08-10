//-------------------------------------------------------------
//6. Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.
//-------------------------------------------------------------

import javax.swing.JOptionPane;

public class Desafio3Exercicio6 {

    public static void main(String[] args){
        String aux_peso, aux_alt;
        float imc, peso, alt;

        aux_peso = JOptionPane.showInputDialog("Informe o peso: ");
        aux_alt = JOptionPane.showInputDialog("Informe a altura: ");

        peso = Float.parseFloat(aux_peso); //Converte string para float
        alt = Float.parseFloat(aux_alt);

        imc = (peso / (alt * alt)); // Cálculo do IMC

        String mensagem = "O IMC é: " +imc;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}



