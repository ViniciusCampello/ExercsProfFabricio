package OutrosExerc;

import javax.swing.JOptionPane;

public class MaquinaAlimento {
    public static void main(String[] args) {
        
        String prod1 = "Biscoito", prod2 = "Salgadinho", prod3 = "Suco";
        Integer prodQ1 = 0, prodQ2 = 0, prodQ3 =0;
        Double valor1 = 2.50, valor2 = 3.00, valor3 = 2.00;
        Double valorFinal = 0.0;
        Integer opcao = -1;
        Double pagamento;

        while (opcao != 0 && opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Disponível\n1. "+prod1+" - R$"+valor1+"\n2. "+prod2+" - R$"+valor2+
            "\n3. "+prod3+" - R$"+valor3+"\n\n5.Finalizar Compra\n0. Cancelar Compra"));
            if (opcao == 1){
                valorFinal = valorFinal + valor1;
                prodQ1++;
                JOptionPane.showMessageDialog(null, "Você adicionou um "+prod1);
            }else if (opcao == 2){
                valorFinal = valorFinal + valor2;
                prodQ2++;
                JOptionPane.showMessageDialog(null, "Você adicionou um "+prod2);
            }else if (opcao == 3){
                valorFinal = valorFinal + valor3;
                prodQ3++;
                JOptionPane.showMessageDialog(null, "Você adicionou um "+prod3);
            }else if (opcao == 5){
                if (valorFinal > 0){
                    JOptionPane.showMessageDialog(null, "Você selecionou:\n"+prodQ1+" "+prod1+"\n"+prodQ2+" "+prod2+"\n"+prodQ3+" "+prod3+
                    "\nValor Final = R$"+valorFinal);
                    pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de pagamento: "));
                    while (pagamento < valorFinal){
                        JOptionPane.showMessageDialog(null, "Pagamento inválido\nValor inserido menor que o valor final\nDinheiro Devolvido");
                        pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de pagamento: "));
                    }
                    JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso\nSeu troco é de R$"+(pagamento - valorFinal)+"\nProdutos Liberados");
                }else{
                    JOptionPane.showMessageDialog(null, "Você não pode finalizar uma compra sem ter selecionado nenhum item.\nCompra Cancelada!");
                }
            }else if (opcao == 0){
                JOptionPane.showMessageDialog(null, "Compra Cancelada");
            }else{
                JOptionPane.showMessageDialog(null, "Opção selecionada inválida");
            }
        }
    }
}
