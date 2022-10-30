package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc5 {
    public static void main(String[] args) {

        Integer sexo;
        Double altura;
        Double pesoH;
        Double pesoM;
        Double peso;
        Double pesoHMin;
        Double pesoHMax;
        Double pesoMMin;
        Double pesoMMax;

        sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo, considere '1' para Homem e '2' para Mulher: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        pesoH = ((72.7 * altura) - 58);
        pesoHMin = (pesoH - (pesoH * 0.15));
        pesoHMax = (pesoH + (pesoH * 0.15));
        pesoM = ((62.1 * altura) - 44.7);
        pesoMMin = (pesoM - (pesoM * 0.15));
        pesoMMax = (pesoM + (pesoM * 0.15));

        if ((sexo == 1) && (peso > pesoHMin) && (peso < pesoHMax)){
            JOptionPane.showMessageDialog(null, "Sexo: Homem\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoHMin + " Kg e " + pesoHMax + " Kg" + 
            "\nStatus: Peso na Média");
        }else if ((sexo == 1) && (peso > pesoHMax)){
            JOptionPane.showMessageDialog(null, "Sexo: Homem\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoHMin + " Kg e " + pesoHMax + " Kg" + 
            "\nStatus: Peso Acima da Média");
        }else if ((sexo == 1) && (peso < pesoHMin)){
            JOptionPane.showMessageDialog(null, "Sexo: Homem\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoHMin + " Kg e " + pesoHMax + " Kg" + 
            "\nStatus: Peso Abaixo da Média");
        }else if ((sexo == 2) && (peso > pesoMMin) && (peso < pesoMMax)){
            JOptionPane.showMessageDialog(null, "Sexo: Mulher\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoMMin + " Kg e " + pesoMMax + " Kg" + 
            "\nStatus: Peso na Média");
        }else if ((sexo == 2) && (peso > pesoMMax)){
            JOptionPane.showMessageDialog(null, "Sexo: Mulher\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoMMin + " Kg e " + pesoMMax + " Kg" + 
            "\nStatus: Peso Acima da Média");
        }else if ((sexo == 2) && (peso < pesoMMin)){
            JOptionPane.showMessageDialog(null, "Sexo: Mulher\nPeso: " + peso + " Kg" + 
            "\nAltura: " + altura + " Metros" + 
            "\nPeso Ideal entre: " + pesoMMin + " Kg e " + pesoMMax + " Kg" + 
            "\nStatus: Abaixo na Média");
        }else{
            JOptionPane.showMessageDialog(null, "Valor digitado é inválido, por favor tente novamente.");
        }


    }
}
