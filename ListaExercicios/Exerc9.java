package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc9 {
    public static void main(String[] args){

        double diagMenor;
        double diagMaior;
        double area;

        JOptionPane.showMessageDialog(null, "Cálculo de Área de Losango\nConsidere os valores em Centímetros", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE, null);

        diagMenor = Double.parseDouble(JOptionPane.showInputDialog("Insira a diagonal menor do Losango: "));
        diagMaior = Double.parseDouble(JOptionPane.showInputDialog("Insira a diagonal maior do Losango: "));
        
        area = (diagMenor * diagMaior) / 2;
        
        JOptionPane.showMessageDialog(null, "A área do Losango equivalente as medidas inseridas é igual a: " + area + " cm");
    }
}
