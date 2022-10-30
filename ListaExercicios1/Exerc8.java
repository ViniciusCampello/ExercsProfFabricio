package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc8 {
    public static void main(String[] args) {
        
        Integer idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        if (idade <= 7){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade abaixo de 7 anos.\nCategoria: Infantil");
        }else if ((idade >= 8) && (idade <= 10)){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade entre 8 e 10 anos.\nCategoria: Juvenil");
        }else if ((idade >= 11) && (idade <= 15)){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade entre 11 e 15 anos.\nCategoria: Adolescente");
        }else if ((idade >= 16) && (idade <= 30)){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade entre 16 e 30 anos.\nCategoria: Adulto");
        }else{
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade acima de 30 anos.\nCategoria: Senior");
        }

    }
}
