package AtividadesJardel;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        
        DecimalFormat f = new DecimalFormat("0.00");
        Double[] altura = new Double[10];
        Double media;
        Double soma = 0.0;
        Integer i;
        String saida = "";

        for (i = 0; i < altura.length;){
            altura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do atleta número "+(i+1)+":\n(Considere o valor em metros)"));
            if (altura[i] > 0){
                soma += altura[i];
                i++;
            }else{
                JOptionPane.showMessageDialog(null, "Altura Inserida deve ser maior que zero!");
            }
        }
        media = soma / altura.length;
        for (i = 0; i < altura.length; i++){
            if (altura[i] > media){
                saida += "Atleta "+(i+1)+" - Altura: "+altura[i]+"\n"; 
            }
        }
        JOptionPane.showMessageDialog(null, "A média de altura dos atletas informados é de "+f.format(media)+" metros"+
        "\nOs atletas com altura maior que a média são:\n"+saida);
    }
}
