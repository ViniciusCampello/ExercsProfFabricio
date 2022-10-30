package ListaExercicios3;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        
        Integer num;
        Integer result;
        Integer i;
        String saida = "";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        for (i = 1; i <= 10; i++){
            result = num * i;
            saida = saida + i + " * " + num + " = " + result + "\n";
        }
        JOptionPane.showMessageDialog(null, "A tabuada do número " + num + " é\n" +saida);
    }
}
