package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args) {
        
        Integer num;
        Integer numMaior = -2147483648;
        Integer numMenor = 2147483647;
        Integer seq;

        for (seq = 0; seq < 20; seq++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (seq+1) + "º, número inteiro: "));
            if (num > numMaior){
                numMaior = num;
            }
            if(num < numMenor){
                numMenor = num;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior numero digitado é: " + numMaior + "\nO menor numero digitado é: " + numMenor);

    }
}
