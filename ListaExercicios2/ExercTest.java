package ListaExercicios2;

import javax.swing.JOptionPane;

public class ExercTest {
    public static void main(String[] args) {
        
        Integer num;
        Integer valor = 1;
        Integer i = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (num > 0){
            while(valor <= num){
                if (num % valor == 0){
                    i++;
                }
                valor++;
            }
            if (i == 2){
                JOptionPane.showMessageDialog(null, "O número " + num + " é primo");
            }else{
                JOptionPane.showMessageDialog(null, "O número " + num + " não é primo");
            }
        }else{
            JOptionPane.showMessageDialog(null, "O número " + num + " não pode ser 0 ou negativo");
        }
    }
}
