package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc7 {
    public static void main(String[] args) {
        
        Double salario;
        Double salarioNovo;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seu salário: "));

        salarioNovo = salario + (salario * 0.30);

        if (salario < 1000){
            JOptionPane.showMessageDialog(null, "Parabéns, você tem receberá um aumento. \nSeu salário será reajustado para R$:" + salarioNovo);
        }else{
            JOptionPane.showMessageDialog(null, "Lamentamos mas seu salário já é maior que o valor de R$1000,00\nPortanto você não tem direito de aumento.");
        }
    }
}
