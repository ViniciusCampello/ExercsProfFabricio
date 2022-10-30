package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

        media = ((nota1 + nota2) / 2);

        if (media >= 7){
            JOptionPane.showMessageDialog(null, "A média entre suas notas é igual a " + media + "\nVocê está aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "A média entre suas notas é igual a " + media + "\nVocê está reprovado");
        }

    }
}
