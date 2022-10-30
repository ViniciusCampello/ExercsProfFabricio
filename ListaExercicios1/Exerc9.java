package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exerc9 {
    public static void main(String[] args) {
        
        Integer idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        if (idade < 16){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade abaixo de 16 anos.\nClasse Eleitoral: Não Eleitor");
        }else if ((idade >= 18) && (idade <= 65)){
            JOptionPane.showMessageDialog(null, "Idade: " + idade + " anos\nIdade entre 18 e 65 anos.\nClasse Eleitoral: Eleitor Obrigatório");
        }else{
            JOptionPane.showMessageDialog(null, "Idade :" + idade + " anos\nIdade entre 16 e 18 anos ou acima de 65 anos.\nClasse Eleitoral: Eleitor Facultativo");
        }
    }
}
