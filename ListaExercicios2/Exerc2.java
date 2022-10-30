package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {

        Integer seq;
        Integer num;
        Integer soma = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        for (seq = 0; seq <= num; seq++){
                soma = soma + seq;
        }
        JOptionPane.showMessageDialog(null, "A soma de todos os números inteiros sequenciais até o número " + num + ", é igual a " + soma);
    }
}
