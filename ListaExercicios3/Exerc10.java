package ListaExercicios3;

import javax.swing.JOptionPane;

public class Exerc10 {
    public static void main(String[] args) {
        
        Integer quant;
        Integer i;
        Integer num, numA = 1, numB = 0;
        String saida = "";

        quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números que deseja aparecer: "));

        for (i=1; i<=quant;i++){
            num = numA + numB;
            numB = numA;
            numA = num;
            saida = saida + num + "\n";
            JOptionPane.showMessageDialog(null, "Sequência:\n" + saida);
        }
    }
}
