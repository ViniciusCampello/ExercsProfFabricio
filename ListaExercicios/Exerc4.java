package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc4 {
    public static void main(String[] args){

        int numA;

        numA = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        if (numA % 5 == 0)
            {JOptionPane.showMessageDialog(null, "O número inserido " + numA + ", é divisível por 5!");}
        else
            {JOptionPane.showMessageDialog(null, "O número inserido " + numA + ", não é divisível por 5!");}
    }
}
