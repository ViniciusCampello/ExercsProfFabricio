package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 7){
            JOptionPane.showMessageDialog(null, "A média entre suas notas é igual a " + media + "\nVocê está aprovado.");
        }else if (media < 3){
            JOptionPane.showMessageDialog(null, "A média entre suas notas é igual a " + media + "\nVocê está reprovado.");
        }else{
            JOptionPane.showMessageDialog(null, "A média entre suas notas é igual a " + media + "\nExame de recuperação pendente.");
        }

    }
}