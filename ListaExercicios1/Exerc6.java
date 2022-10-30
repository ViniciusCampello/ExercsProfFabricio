package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc6 {
    public static void main(String[] args) {

        Double altura;
        Double peso;
        Double imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de altura em metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do peso em kilos: "));

        imc = peso / (Math.pow(altura, 2));

        if (imc < 20){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Abaixo do Peso");
        }else if ((imc >= 20) && (imc <= 25)){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Peso Normal");
        }else if ((imc > 25) && (imc <= 30)){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Sobre Peso");
        }else if ((imc > 30) && (imc <= 40)){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Obeso");
        }else{
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Obeso Mórbido");
        }
        
    }
    
}
