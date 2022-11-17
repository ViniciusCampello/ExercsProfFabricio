package AtividadesJardel;

import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        
        Integer qtdAluno = 0, i;
        Double nota[] = new Double [10];
        Double media;
        Double soma = 0.0;

        for (i = 0; i < nota.length;){
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do "+(i+1)+"º aluno:\n(Considere notas de 0 a 10)"));
            if (nota[i] >= 0 && nota[i] <= 10){
                soma+= nota[i];
                i++;
            }else{
                JOptionPane.showMessageDialog(null, "Nota inserida inválida, tente novamente!");
            }
        }
        media = soma / nota.length;
        for (i = 0; i < nota.length; i++){
            if (nota[i] >= media){
                qtdAluno++;
            }
        }
        JOptionPane.showMessageDialog(null, "Média total da turma: "+media+"\nAlunos acima ou igual a média: "+qtdAluno);
    }
}
