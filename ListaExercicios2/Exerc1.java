package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
        
        Integer seq = 0;
        Integer numero;
        String saida = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        for (seq = 0; seq <= numero; seq++){
            saida = saida + ", " + seq;
            //JOptionPane.showMessageDialog(null, "A sequência de números até o valor digitado, partindo de 0, é igual a" + saida);
        }
        JOptionPane.showMessageDialog(null, "A sequência de números até o valor digitado, partindo de 0, é igual a" + saida);
    }
}
