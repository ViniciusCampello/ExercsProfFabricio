package AtividadesJardel;

import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Integer[] numEmpregado = new Integer[5];
        Integer[] mes = new Integer[5];
        Integer i;
        String saida = "";

        for (i = 0; i < mes.length; i++){
            numEmpregado[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do empregado "+(i+1)+":"));
            mes[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de meses de trabalho deste empregado:"));
            while (mes[i] < 0){
                JOptionPane.showMessageDialog(null, "Número de meses de trabalho inválido!");
                mes[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de meses de trabalho deste empregado:"));
            }
        }
        for (i = 0; i < mes.length; i++){
            if (mes[i] < 6){
                //System.out.println("Empregado número "+numEmpregado[i]+" - Meses trabalhados "+(mes[i]));
                saida += "Empregado número "+numEmpregado[i]+" - Meses trabalhados: "+(mes[i])+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Funcionários com menos de 6 meses na empresa:\n"+saida);
    }
}
