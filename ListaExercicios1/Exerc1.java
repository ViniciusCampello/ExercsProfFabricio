package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
        
        Double numA;
        Double numB;

        numA = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (numA > numB){
            JOptionPane.showMessageDialog(null, "Entre os números digitados.\nO maior número é " + numA + "\nO menor número é " + numB);
        }else if (numB > numA){
            JOptionPane.showMessageDialog(null, "Entre os números digitados.\nO maior número é " + numB + "\nO menor número é " + numA);
        }else{
            JOptionPane.showMessageDialog(null, "Os números digitado são iguais, portanto não existe número maior, nem menor.");
        }
    }
}
