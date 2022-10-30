package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc7 {
    public static void main(String[] args){

        double salario;
        double prestacao;
        double maxPrestacao;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário: "));
        prestacao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da prestação desejada: "));

        maxPrestacao = salario * 0.3;

        if(prestacao > maxPrestacao)
            {JOptionPane.showMessageDialog(null, "O valor da prestação de R$:" + prestacao + " é maior que os 30% permitidos pela prefeitura." + 
            "\nO valor máximo da prestação em relação ao salário desejado é de R$:" + maxPrestacao + 
            "\n\nO empréstimo não pode ser concedido.");}
        else
            {JOptionPane.showMessageDialog(null, "O valor da prestação de R$:" + prestacao + " é menor ou igual aos 30% permitidos pela prefeitura." + 
            "\nO valor máximo da prestação em relação ao salário desejado é de R$:" + maxPrestacao + 
            "\n\nO empréstimo pode ser concedido.");}
    }    
}
