package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc5 {
    public static void main(String[] args){

        double numA;
        double numB;

        numA = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));

        if (numA > numB && numA >=0)
            {JOptionPane.showMessageDialog(null, "A raiz quadrada do primeiro número " + numA + ", é igual a " + Math.sqrt(numA) + 
            "\nEnquanto o segundo número " + numB + ", elevado ao quadrado é igual a " + Math.pow(numB, 2));}
        else if (numA > numB && numA <=0)
            {JOptionPane.showMessageDialog(null, "A raiz quadrada do primeiro número " + numA + ", não pode ser calculada." + 
            "\nEnquanto o segundo número " + numB + ", elevado ao quadrado é igual a " + Math.pow(numB, 2));}
        else if (numB > numA && numB >=0)
            {JOptionPane.showMessageDialog(null,"A raiz quadrada do segundo número " + numB + ", é igual a " + Math.sqrt(numB) + 
            "\nEnquanto o primeiro número " + numA + ", elevado ao quadrado é igual a " + Math.pow(numA, 2));}
        else if (numB > numA && numB <=0)
            {JOptionPane.showMessageDialog(null, "A raiz quadrada do segundo número " + numB + ", não pode ser calculada." + 
            "\nEnquanto o primeiro número " + numA + ", elevado ao quadrado é igual a " + Math.pow(numA, 2));}
        else if (numA == numB && numA >= 0)
            {JOptionPane.showMessageDialog(null, "Os números inseridos são iguais." + 
            "\nSendo a raiz quadrada de " + numA + ", igual a " + Math.sqrt(numA) + 
            "\nE sua elevação ao quadrado igual a " + Math.pow(numA, 2));}
        else 
            {JOptionPane.showMessageDialog(null, "Os números inseridos são iguais." + 
            "\nO número " + numA + ", é negativo, portanto sua raiz quadrada não pode ser calculada." +
            "\nEntretanto, sua elevação ao quadrado é igual a " + Math.pow(numA, 2));}
    }
}
