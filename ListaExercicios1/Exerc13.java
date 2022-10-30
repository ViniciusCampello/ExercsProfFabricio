package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc13 {
    public static void main(String[] args) {
        
        Double numA;
        Double numB;
        Double numC;
        Double delta;
        Double x1;
        Double x2;

        JOptionPane.showMessageDialog(null, "Cálculo de Equação de Segundo Grau\nax² + bx + c = 0", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE, null);

        numA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de 'a': "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de 'b': "));
        numC = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de 'c': "));

        delta = (numB * numB) - (4 *(numA * numC));
        x1 = (((- numB) + Math.sqrt(delta)) / (2 * numA));
        x2 = (((- numB) - Math.sqrt(delta)) / (2 * numA));

        if (delta > 0){
            JOptionPane.showMessageDialog(null, "O valor de delta é igual a " + delta +
            "\nExistem duas soluções para a equação de segundo grau " + numA + "x² + (" + numB + "x) + (" + numC + ") = 0" +
            "\nSão elas x = " + x1 + " e x = " + x2);
        }else if(delta < 0){
            JOptionPane.showMessageDialog(null, "O valor de delta é igual a " + delta +
            "\nNão existe raiz real, com isso não é possivel resolver a equação de segundo grau.");
        }else{
            JOptionPane.showMessageDialog(null, "O valor de delta é igual a " + delta +
            "\nExiste apenas uma solução para a equação de segundo grau " + numA + "x² + (" + numB + "x) + (" + numC + ") = 0" +
            "\nSendo ela x = " + x1);
        }
    }
}
