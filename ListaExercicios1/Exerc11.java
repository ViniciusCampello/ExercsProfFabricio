package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc11 {
    public static void main(String[] args) {
        
        Integer mes;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o mês.\nConsidere os números de 1 a 12: "));

        if (mes == 1){
            JOptionPane.showMessageDialog(null, "O primeiro mês do ano é Janeiro");
        }else if (mes == 2){
            JOptionPane.showMessageDialog(null, "O segundo mês do ano é Fevereiro");
        }else if (mes == 3){
            JOptionPane.showMessageDialog(null, "O terceiro mês do ano é Março");
        }else if (mes == 4){
            JOptionPane.showMessageDialog(null, "O quarto mês do ano é Abril");
        }else if (mes == 5){
            JOptionPane.showMessageDialog(null, "O quinto mês do ano é Maio");
        }else if (mes == 6){
            JOptionPane.showMessageDialog(null, "O sexto mês do ano é Junho");
        }else if (mes == 7){
            JOptionPane.showMessageDialog(null, "O sétimo mês do ano é Julho");
        }else if (mes == 8){
            JOptionPane.showMessageDialog(null, "O oitavo mês do ano é Agosto");
        }else if (mes == 9){
            JOptionPane.showMessageDialog(null, "O nono mês do ano é Setembro");
        }else if (mes == 10){
            JOptionPane.showMessageDialog(null, "O décimo mês do ano é Outubro");
        }else if (mes == 11){
            JOptionPane.showMessageDialog(null, "O décimo primeiro mês do ano é Novembro");
        }else if (mes == 12){
            JOptionPane.showMessageDialog(null, "O décimo segundo e último mês do ano é Dezembro");
        }else{
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + mes + "\nValor inválido, não existe mês com este número.");
        }
    }
}
