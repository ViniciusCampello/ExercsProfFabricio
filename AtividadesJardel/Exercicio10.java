package AtividadesJardel;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
       
        DecimalFormat f = new DecimalFormat("0.00");

        Integer opcao = 0;
        Integer mes;
        double salario;
        double salarioTotal;
        double inss = 0;

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções:\n1. Novo Salário\n2. Férias\n3. Décimo Terceiro"+
            "\n4. Calcular INSS\n5. Encerrar Aplicação\n\nDigite a opção desejada:"));
            
            if (opcao == 1){
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:"));
                if (salario > 0 && salario <= 3500){
                    salarioTotal = salario * 1.15;
                    JOptionPane.showMessageDialog(null, "Seu salário atual é de R$"+salario+"\nVocê receberá um aumento de 15%"+
                    "\nTotalizando em um novo salário de R$"+f.format(salarioTotal));
                }else if (salario > 3500 && salario <= 6000){
                    salarioTotal = salario * 1.10;
                    JOptionPane.showMessageDialog(null, "Seu salário atual é de R$"+salario+"\nVocê receberá um aumento de 10%"+
                    "\nTotalizando em um novo salário de R$"+f.format(salarioTotal));
                }else if (salario > 6000){
                    salarioTotal = salario * 1.05;
                    JOptionPane.showMessageDialog(null, "Seu salário atual é de R$"+salario+"\nVocê receberá um aumento de 5%"+
                    "\nTotalizando em um novo salário de R$"+f.format(salarioTotal));
                }else{
                    JOptionPane.showMessageDialog(null, "Valor de salário digitado inválido, tente novamente.");
                }
            }else if (opcao == 2){
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:"));
                if (salario > 0){
                    salarioTotal = salario + (salario / 3);
                    JOptionPane.showMessageDialog(null, "A partir do salário informado de R$"+salario+
                    "\nO valor das suas férias é de R$"+f.format(salarioTotal));
                }else{
                    JOptionPane.showMessageDialog(null, "Valor de salário digitado inválido, tente novamente.");
                }
            }else if (opcao == 3){
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:"));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de meses que este funcionário trabalha na empresa (máximo 12):"));
                salarioTotal = salario * mes / 12;
                if (salario > 0 && mes >= 1 && mes <= 12){
                    JOptionPane.showMessageDialog(null, "A partir do salário informado de R$"+salario+
                    "\nE a quantidade atual de "+mes+" meses trabalhados."+
                    "\nO funcionário terá direito a um décimo terceiro de R$"+f.format(salarioTotal));
                }else{
                    JOptionPane.showMessageDialog(null, "Valor de sálario e/ou número de meses digitado inválido, tente novamente.");
                }
            }else if (opcao == 4){
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:"));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de meses que este funcionário trabalha na empresa (máximo 12):"));
                if (salario > 0 && salario <= 1100 && mes >= 1 && mes <= 12){
                    inss = (salario * 0.075) * mes;
                    salarioTotal = (salario * mes) - inss;
                    JOptionPane.showMessageDialog(null, "O valor do seu INSS mensal é de R$"+f.format((inss / mes))+
                    "\nVocê deverá pagar um total de R$"+f.format(inss)+" ao seu ano trabalhado."+
                    "\nResultando em um salário líquido neste ano de R$"+f.format(salarioTotal));
                }else if (salario > 1100 && salario <= 2203.48 && mes >= 1 && mes <= 12){
                    inss = (salario * 0.09) * mes;
                    salarioTotal = (salario * mes) - inss;
                    JOptionPane.showMessageDialog(null, "O valor do seu INSS mensal é de R$"+f.format((inss / mes))+
                    "\nVocê deverá pagar um total de R$"+f.format(inss)+" ao seu ano trabalhado."+
                    "\nResultando em um salário líquido neste ano de R$"+f.format(salarioTotal));
                }else if (salario > 2203.48 && salario <= 3305.22 && mes >= 1 && mes <= 12){
                    inss = (salario * 0.12) * mes;
                    salarioTotal = (salario * mes) - inss;
                    JOptionPane.showMessageDialog(null, "O valor do seu INSS mensal é de R$"+f.format((inss / mes))+
                    "\nVocê deverá pagar um total de R$"+f.format(inss)+" ao seu ano trabalhado."+
                    "\nResultando em um salário líquido neste ano de R$"+f.format(salarioTotal));
                }else if (salario > 3305.22 && salario <= 6433.57 && mes >= 1 && mes <= 12){
                    inss = (salario * 0.14) * mes;
                    salarioTotal = (salario * mes) - inss;
                    JOptionPane.showMessageDialog(null, "O valor do seu INSS mensal é de R$"+f.format((inss / mes))+
                    "\nVocê deverá pagar um total de R$"+f.format(inss)+" ao seu ano trabalhado."+
                    "\nResultando em um salário líquido neste ano de R$"+f.format(salarioTotal));
                }else if (salario > 6433.57 && mes >= 1 && mes <= 12){
                    inss = 751.97;
                    salarioTotal = (salario * mes) - (inss * mes);
                    JOptionPane.showMessageDialog(null, "O valor do seu INSS mensal é de R$"+(inss)+
                    "\nVocê deverá pagar um total de R$"+f.format((inss * mes))+" ao seu ano trabalhado."+
                    "\nResultando em um salário líquido neste ano de R$"+f.format(salarioTotal));
                }else{
                    JOptionPane.showMessageDialog(null, "Valor de sálario e/ou número de meses digitado inválido, tente novamente.");
                }
            }else if (opcao == 5){
                JOptionPane.showMessageDialog(null, "Finalizando...");
            }else{
                JOptionPane.showMessageDialog(null, "Opção selecionada inválida, tente novamente.");
            }
        }
        JOptionPane.showMessageDialog(null, "Aplicação Encerrada.");
    }
}