package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc12 {
    public static void main(String[] args) {
        
        Double numA;
        Double numB;
        Integer operacao;

        numA = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja realizar?!\nDigite 1 para Somar\nDigite 2 para Subtrair\nDigite 3 para Multiplicar\nDigite 4 para Dividir\nDigite 5 para Sair da Aplicação"));

        if (operacao == 1){
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: Somar\n" +
            numA + " + " + numB + " = " + (numA + numB));
        }else if (operacao == 2){
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: Subtrair\n" + 
            numA + " - " + numB + " = " + (numA - numB));
        }else if (operacao == 3){
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: Multiplicar\n" + 
            numA + " * " + numB + " = " + (numA * numB));
        }else if (operacao == 4){
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: Dividir\n" + 
            numA + " / " + numB + " = " + (numA / numB));
        }else{
            JOptionPane.showMessageDialog(null, "Você escolheu a opção sair ou inseriu um número inválido.\nAperte 'Ok' para encerrar aplicação");
        }
    }
}
