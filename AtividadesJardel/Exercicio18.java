package AtividadesJardel;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        
        DecimalFormat f = new DecimalFormat("0.0");
        Double[] temperatura = new Double[7];
        String[] dia = new String[7];
        Double soma = 0.0, media;
        Integer i;
        String saida = "";
        dia[0] = "Domingo"; dia[1] = "Segunda-feira"; dia[2] = "Terça-feira"; dia[3] = "Quarta-feira"; 
        dia[4] = "Quinta-feira"; dia[5] = "Sexta-feira"; dia[6] = "Sábado";

        for (i = 0; i < 7;i++){
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite em Grau Celsius a temperatura de "+dia[i]+":"));
            soma += temperatura[i];
        }
        media = soma / 7;
        for (i = 0; i < 7; i++){
            if (temperatura[i] > media){
                saida += dia[i]+" - Temperatura: "+temperatura[i]+" °C\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Média de temperatura desta semana igual a "+f.format(media)+
        " °C\nDias com temperatura acima da média:\n"+saida);
    }
}
