package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc6 {
    public static void main(String[] args){

        double numA;
        double numB;

        numA = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));

        if (numA < numB)
            {JOptionPane.showMessageDialog(null, "Os números inseridos de forma crescente são: " + numA + ", " + numB);}
        else if(numA > numB)
            {JOptionPane.showMessageDialog(null, "Os números inseridos de forma crescente são: " + numB + ", " + numA);}
        else 
            {JOptionPane.showMessageDialog(null, "Os números inseridos " + numA + ", são iguais, portanto não possuem uma ordem crescente.");}
    }
}
