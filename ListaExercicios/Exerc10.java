package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc10 {
    public static void main(String[] args){

        int polegada;
        double resultado;

        polegada = Integer.parseInt(JOptionPane.showInputDialog("Insira a medida em polegadas: "));

        resultado = polegada * 2.54;

        JOptionPane.showMessageDialog(null, "A equivalência de " + polegada + " polegadas em centímetros é igual a " + resultado + " cm");
        
    }
}
