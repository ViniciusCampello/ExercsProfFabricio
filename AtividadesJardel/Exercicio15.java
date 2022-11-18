package AtividadesJardel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        
        ArrayList<String> livros = new ArrayList<>();
        String titulo, autor, edicao, editora, genero, ano;
        String test = "";
        Integer opcao = 1, opcao2 = 1, livro;
        Integer qtdLivro = 0;

        while (opcao != 2){
            if (opcao == 1){
                titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
                autor = JOptionPane.showInputDialog("Digite o autor do livro: ");
                edicao = JOptionPane.showInputDialog("Digite a edição do livro: ");
                editora = JOptionPane.showInputDialog("Digite a editora do livro: ");
                genero = JOptionPane.showInputDialog("Digite o gênero do livro: ");
                ano = JOptionPane.showInputDialog("Digite o ano de lançamento do livro: ");
                JOptionPane.showMessageDialog(null, "Livro "+(qtdLivro+1)+" Cadastrado com Sucesso!\nTítulo: "+titulo+"\nAutor: "+autor+
                "\nEdição: "+edicao+"\nEditora: "+editora+"\nGênero: "+genero+"\nAno de Lançamento: "+ano);
                test = "Título: "+titulo+"\nAutor: "+autor+"\nEdição: "+edicao+
                "\nEditora: "+editora+"\nGênero: "+genero+"\nAno de Lançamento: "+ano;
                livros.add(test);
                qtdLivro++;
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja Continuar?\n1. Para Cadastrar outro livro\n2. Para Encerrar Cadastro"));
            }else{
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção Inválida\n1. Para Cadastrar livro\n2. Para Encerrar Cadastro"));
            }
        }
        JOptionPane.showMessageDialog(null, "Total de livros cadastrados: " + qtdLivro + " livros.");
        while (opcao2 != 2){
            livro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a "+qtdLivro+" para consultar o livro cadastrado."));
            if (livro >= 1 && livro <= qtdLivro){
                livro--;
                JOptionPane.showMessageDialog(null, "Livro da posição: "+(livro+1)+"\n"+livros.get(livro));
                opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja Pesquisar outro livro?\n1. Para Continuar\n2. Encerrar Aplicação"));
            }else{
                opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Número de Livro Inválido\n1. Para Pesquisar livro\n2. Para Encerrar Aplicação"));
            }
        }
    }
}
