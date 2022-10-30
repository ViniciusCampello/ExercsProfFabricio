package ListaExercicios3;

import javax.swing.JOptionPane;

public class Exerc9 {
    public static void main(String[] args) {
        
        Integer num;
        Integer i;
        Integer result = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        for (i = 1; i <= num; i++){
            result = result * i;
        }

        JOptionPane.showMessageDialog(null, "A fatorial do número " + num + " é igual a " + result);
    }
}
