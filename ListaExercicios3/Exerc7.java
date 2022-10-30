package ListaExercicios3;

import javax.swing.JOptionPane;

public class Exerc7 {
    public static void main(String[] args) {
        
        Double altura;
        Double peso;
        Double imc;

        JOptionPane.showMessageDialog(null, "Considere:\n\nMenor que 18,5 = Abaixo do Peso\nDe 18,5 a 24,99 = Peso Normal"+
        "\nDe 25 a 29,99 = Excesso de Peso\nDe 30 a 34,99 = Obesidade\nMaior que 35 = Obesidade Extrema", "Calculadora IMC", 1);

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua Altura em metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso em kilos: "));

        imc = peso / (Math.pow(altura, 2));

        if (imc >= 0 && imc < 18.5){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Abaixo do Peso");
        }else if (imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Peso Normal");
        }else if (imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Excesso de Peso");
        }else if (imc >= 30 && imc < 35){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Obesidade");
        }else if (imc >= 35){
            JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corpórea é de " + imc + "\nSituação: Obesidade Extrema");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular o IMC, provável entrada de dados inválida");
        }
    }
}
