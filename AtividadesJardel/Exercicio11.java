package AtividadesJardel;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Integer opcao = 0, opcao2 = 0, opcao3 = 0;
        Integer quantInt = 0;
        Integer quantMeia = 0;
        Double totalInt = 0.0;
        Double totalMeia = 0.0;
        Double ingresso = 10.0;

        while (opcao != 2){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Disponivel\n1. Comprar Ingresso\n2. Encerrar Aplicação"));
            if (opcao == 1){
                while (opcao2 != 4 && opcao2 != 3){
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Ingressos Disponiveis\n1. Inteiro - R$ "+ingresso+
                    "\n2. Meio Entrada - R$ "+(ingresso/2)+"\n3. Finalizar Compra\n4. Cancelar"));
                    if (opcao2 == 1){
                        quantInt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Ingresso Inteiro que deseja comprar: "));
                        totalInt = ingresso * quantInt;
                        JOptionPane.showMessageDialog(null, quantInt+" Ingressos Inteiro selecionados resultando em R$ "+totalInt);
                    }else if (opcao2 == 2){
                        quantMeia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Ingressos de Meia Entrada que deseja comprar: "));
                        totalMeia = (ingresso/2) * quantMeia;
                        JOptionPane.showMessageDialog(null, quantMeia+" Ingressos de Meia Entrada selecionado resultando em R$ "+totalMeia);
                    }else if (opcao2 == 3){
                        JOptionPane.showMessageDialog(null, "Resumo da Compra\n"+quantInt+" - Ingresso Inteiro = R$ "+totalInt+"\n"+
                        quantMeia+" - Ingresso Meia Entrada = R$ "+totalMeia+"\nTotal da Compra R$ "+(totalInt + totalMeia));
                        while (opcao3 != 4){
                            opcao3 = Integer.parseInt(JOptionPane.showInputDialog("Pagamento Disponivel\n1. Boleto - Preço Integral"+
                            "\n2. Cartão - Acréscimo de 5%"+"\n3. Pix - 5% de Desconto\n4. Cancelar Pagamento"));
                            if (opcao3 == 1){
                                JOptionPane.showMessageDialog(null, "Valor pago em Boleto no valor de R$ "+(totalInt + totalMeia));
                                JOptionPane.showMessageDialog(null, "Compra Efetuada com Sucesso!\nAgradecemos pela Compra!\nRetornando ao Menu Principal...");
                                break;
                            }else if (opcao3 == 2){
                                JOptionPane.showMessageDialog(null, "Valor pago em Cartão no valor de R$ "+((totalInt + totalMeia)) * 1.05);
                                JOptionPane.showMessageDialog(null, "Compra Efetuada com Sucesso!\nAgradecemos pela Compra!\nRetornando ao Menu Principal...");
                                break;
                            }else if (opcao3 == 3){
                                JOptionPane.showMessageDialog(null, "Valor pago em Pix no valor de R$ "+((totalInt + totalMeia)) * 0.95);
                                JOptionPane.showMessageDialog(null, "Compra Efetuada com Sucesso!\nAgradecemos pela Compra!\nRetornando ao Menu Principal...");
                                break;
                            }else if (opcao3 == 4){
                                JOptionPane.showMessageDialog(null, "Pagamento Cancelado\nRetornando ao Menu Principal...");
                            }else{
                                JOptionPane.showMessageDialog(null, "Opção de Pagamento Inválida");
                            }
                        }
                    }else if (opcao2 == 4){
                        JOptionPane.showMessageDialog(null, "Compra Cancelada\nRetornando ao Menu Principal...");
                    }else{
                        JOptionPane.showMessageDialog(null, "Opção selecionada inválida");
                    }
                }
                opcao2 = 0;
                opcao3 = 0;
            }else if (opcao == 2){
                JOptionPane.showMessageDialog(null, "Encerrando Aplicação...");
            }else{
                JOptionPane.showMessageDialog(null, "Opção selecionada inválida");
            }
        }
        JOptionPane.showMessageDialog(null, "Aplicação Encerrada\nObrigado por Utilizar!");
    }
}

