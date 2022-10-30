package ListaExercicios;

import javax.swing.JOptionPane;

public class Exerc8 {
    public static void main(String[] args){

        int idade;
        int pessoa;
        int contador = 0;

        for (pessoa = 1; pessoa <= 20; pessoa++)
        {idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
            if(idade >= 18) 
                {contador = contador +1;}
        }
        JOptionPane.showMessageDialog(null, "Dentre as vinte pessoas selecionadas, " + contador + " delas tem mais de 18 anos.");
    }
}
