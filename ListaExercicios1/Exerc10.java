package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc10 {
    public static void main(String[] args) {
        
        Integer dia;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o dia da semana.\nConsidere os números de 1 a 7: "));

        if (dia == 1){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Domingo");
        }else if (dia == 2){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Segunda-Feira");
        }else if (dia == 3){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Terça-Feira");
        }else if (dia == 4){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Quarta-Feira");
        }else if (dia == 5){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Quinta-Feira");
        }else if (dia == 6){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Sexta-Feira");
        }else if (dia == 7){
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nDia da semana: Sábado");
        }else{
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + dia + "\nValor inválido, tente novamente.");
        }
    }
}
