package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc4 {
    public static void main(String[] args) {
        
        Double ladoA;
        Double ladoB;
        Double ladoC;

        ladoA = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Lado A: "));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Lado B: "));
        ladoC = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Lado C: "));

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)){
            JOptionPane.showMessageDialog(null, "Qualquer um dos lados é menor que a soma de qualquer outro lado. \nEste é um triângulo válido.");
        }else{
            JOptionPane.showMessageDialog(null, "Um dos lados é maior que soma dos outros dois lados. \nNão é um triângulo válido.");
        }

    }
}
