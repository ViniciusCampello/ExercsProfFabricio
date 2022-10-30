package ListaExercicios;

import javax.swing.JOptionPane;

public class ExercTeste {
    public static void main(String[] args){

        long[] valor = new long[4];
        boolean troca;

        valor[1] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        valor[2] = Integer.parseInt(JOptionPane.showInputDialog("Insira mais um número: "));
        valor[3] = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número: "));
        valor[4] = Integer.parseInt(JOptionPane.showInputDialog("Insira o último número: "));

        do{
            troca = false;
            for(int i=0; i < valor.length - 1; i++){
                if(valor[i] > valor [i + 1]){
                    long aux = valor[i];
                    valor[i] = valor[i + 1];
                    valor [i + 1] = aux;

                    troca = true;
                }
            }
        } while (troca);
        JOptionPane.showMessageDialog(null, "Os números digitado em ordem crescente são: " + valor);

    }
}