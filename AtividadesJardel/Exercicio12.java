package AtividadesJardel;

import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        
        String titulo, autor, edicao, editora, genero, ano;
        Integer opcao = 1;
        Integer qtdLivro = 0;

        while (opcao != 2){
            if (opcao == 1){
                titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
                autor = JOptionPane.showInputDialog("Digite o autor do livro: ");
                edicao = JOptionPane.showInputDialog("Digite a edição do livro: ");
                editora = JOptionPane.showInputDialog("Digite a editora do livro: ");
                genero = JOptionPane.showInputDialog("Digite o gênero do livro: ");
                ano = JOptionPane.showInputDialog("Digite o ano de lançamento do livro: ");
                JOptionPane.showMessageDialog(null, "Livro Cadastrado com Sucesso!\nTítulo: "+titulo+"\nAutor: "+autor+
                "\nEdição: "+edicao+"\nEditora: "+editora+"\nGênero: "+genero+"\nAno de Lançamento: "+ano);
                qtdLivro++;
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja Continuar?\n1. Para cadastrar outro livro\n2. Para Encerrar Aplicação"));
            }else{
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção Inválida\n1. Para cadastrar livro\n2. Para Encerrar Aplicação"));
            }
        }
        JOptionPane.showMessageDialog(null, "Total de livros cadastrados: " + qtdLivro + " livros.");
    }
}
//opcao = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Cadastro", JOptionPane.YES_NO_OPTION);