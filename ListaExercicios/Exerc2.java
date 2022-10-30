package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args){

        int numA;

        numA = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        if (numA % 2 == 0)
            {JOptionPane.showMessageDialog(null, "O número " + numA + ", é um número Par!");}
        else 
            {JOptionPane.showMessageDialog(null, "O número " + numA + ", é um número Ímpar!");}
    }
}