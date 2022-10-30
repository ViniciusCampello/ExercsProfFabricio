package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc8 {
    public static void main(String[] args) {
        
        Integer pagamento;
        Integer vezes;
        Integer mes = 1;
        Double valor;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
        pagamento = Integer.parseInt(JOptionPane.showInputDialog("Qual opção de pagamento deseja usar?\n1.A vista - 10% de Desconto\n2.Parcelado em 2 vezes - Valor Integral\n3.Parcelado de 3 até 10 vezes - 3% de juros ao mês"));
        
        if (pagamento == 1){
            JOptionPane.showMessageDialog(null, "O valor final da sua compra é de R$" + (valor * 0.90));
        }else if (pagamento == 2){
            JOptionPane.showMessageDialog(null, "O valor final da sua compra é de R$" + valor + "\nDividida em 2 vezes de R$" + (valor/2));
        }else if (pagamento == 3 && valor >= 100){
            vezes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deseja dividir?"));
            for (mes = 1; mes <= vezes; mes++){
                valor = (valor * 1.03);
            }
            JOptionPane.showMessageDialog(null, "O valor final da sua compra será de R$" + valor +
            "\nDividida em " + vezes + " vezes de R$" + (valor/vezes));
        }else if (pagamento == 3 && valor < 100){
            vezes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deseja dividir?"));
            JOptionPane.showMessageDialog(null, "O valor final da sua compra é de R$" + valor +
            "\nDividida em " + vezes + " vezes de R$" + (valor/vezes));
        }

    }
}
