package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc7 {
    public static void main(String[] args) {
        
        Integer num;
        Integer soma = 1;
        Integer i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        if (num >= 0){
            for (i = num; i > 1; i--){
                soma = soma * i;
            }
            JOptionPane.showMessageDialog(null, "A fatorial do número " + num + " é igual a " + soma);
        }else{
            JOptionPane.showMessageDialog(null, "O número não pode ser negativo.");
        }
    }
}
//for (i = 1; i <= num; i++) operação em ordem crescente - 1*2*3
//for (i = num; i > 1; i--) operação em ordem descrescente - 3*2*1