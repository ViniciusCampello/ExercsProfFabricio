package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc9 {
    public static void main(String[] args) {
        
        Integer num;
        Integer qntDivisor = 0;
        Integer i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

        if (num > 0){
            for (i = 1; i <= num; i++){
                if (num % i == 0){
                    qntDivisor++;
                }
            }
            if (qntDivisor == 2){
                JOptionPane.showMessageDialog(null, "O número " + num + " é um número primo.");
            }else{
                JOptionPane.showMessageDialog(null, "O número " + num + " não é um número primo.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O número digitado deve ser maior que zero!");
        }
    }
}
