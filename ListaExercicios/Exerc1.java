package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args){
    
        int numA;
    
        numA = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
    
        if (numA == 0)
            {JOptionPane.showMessageDialog(null, "O número inserido foi: " + numA + "\nEste número é Nulo");}
        else if (numA > 0)
            {JOptionPane.showMessageDialog(null, "O número inserido foi: " + numA + "\nEste número é Positivo");}
        else 
            {JOptionPane.showMessageDialog(null, "O número inserido foi: " + numA + "\nEste número é Negativo");}
      }
    }