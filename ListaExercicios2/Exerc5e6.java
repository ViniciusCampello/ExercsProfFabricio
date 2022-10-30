package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc5e6 {
    public static void main(String[] args) {
        
        Integer base;
        Integer exp;
        Integer result = 1;
        Integer i;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a base:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o expoente:"));

        for (i = 1; i <= exp; i++){
            result = result * base;
        }
        JOptionPane.showMessageDialog(null, "Resultado da exponenciação " + base + "^" + exp + " é igual a " + result);
    }
}
