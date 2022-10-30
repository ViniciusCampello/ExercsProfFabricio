package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args){

        double numA;

        numA = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        if (numA >= 0)
            {JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numA + " é " + Math.sqrt(numA));}
        else
            {JOptionPane.showMessageDialog(null, "A elevação ao quadrado de " + numA + " é " + Math.pow(numA, 2));}
    }  
}
