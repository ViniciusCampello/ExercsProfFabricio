package ListaExercicios3;

import javax.swing.JOptionPane;

public class ExercTeste {
    public static void main(String[] args) {
        
        Integer linha;
        Integer i, j;
        String saida = "";

        linha = Integer.parseInt(JOptionPane.showInputDialog("Linhas: "));

        for (i = 1;i <= linha;i++){
            for (j = 1;j <= i;j++){
                saida = saida + "* ";
            }
            saida = saida + "\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }    
}
