package ListaExercicios3;

import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args) {
        
        Integer opcao = -1;

        JOptionPane.showMessageDialog(null, "Estrutura de repetição, é uma estrutura que permite que um mesmo trecho do código"+
        "\npossa ser executado mais de uma vez, sendo algumas delas o 'while', 'do-while' e 'for'.", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE, null);

        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual estrutura de repetição você deseja consultar:\n1. While\n2. Do-While\n3. For\n\n0. Encerrar Aplicação"));
            if (opcao == 1){
                JOptionPane.showMessageDialog(null, "Estrutura de Repetição selecionada: While"+
                "\n\nA estrutura 'while', pode ter seu significado literal em português para 'enquanto',"+
                "\nou seja, ela ira executar o código enquanto sua variável de condição for verdadeira."+
                "\nEla inicializa a variável e depois executa o código, então você deve definir o estado"+
                "\ninicial da variável de condição antes de sua execução."+
                "\nEm termos de programação ela aparenta como:\n\nwhile (condição de parada) { \ncódigo a ser executado \n}");
            }else if (opcao == 2){
                JOptionPane.showMessageDialog(null, "Estrutura de Repetição selecionada: Do-While"+
                "\n\nSendo o 'do-while' uma variação da estrutura 'while', em relação que ela também"+
                "\nexecutará o código enquanto a variável de condição for verdadeira, esta tem uma"+
                "\ndiferença na qual será sempre garantido que o código execute pelo menos uma vez."+
                "\nEla executa o código primeiro e depois inicializa a variável de condição, então"+
                "\nnão é necessário que variável seja inicializada antes."+
                "\nEm termos de programação ela aparenta como: \n\ndo {\ncódigo a ser executado\n} while (condição de parada)");
            }else if (opcao == 3){
                JOptionPane.showMessageDialog(null, "Estrutura de Repetição selecionada: For"+
                "\n\nA estrutura 'for', é uma estrutura compacta e visivelmente completa onde ela"+
                "\narmazena sua variável de condição, variável de interação e incremento no começo."+
                "\nDiferente das outras estruturas no 'for' você terá o controle de quantidade de"+
                "\nvezes na qual o comando poderá executado, pois ao final do comando a variável"+
                "\nde controle sofrerá uma alteração positiva ou negativa de acordo com utilização."+
                "\nEm termos de programação ela aparente como: \n\nfor (variável de entrada; condição de parada; incremento da variável de entrada){\ncódigo a ser executado\n}"+
                "\nOu um exemplo mais prático: for (i = 0; i < 10; i++){}\nDessa forma será garantido o que comando será executado 10 vezes.");
            }else if (opcao == 0){
                JOptionPane.showMessageDialog(null, "Foi apenas uma breve explicação sobre como cada estrutura de repetição pode funcionar"+
                "\nObrigado por utilizar esta aplicação\nFinalizando...");
            }else{
                JOptionPane.showMessageDialog(null, "Opção selecionada é inválida, tente novamente.");
            }
        }
        JOptionPane.showMessageDialog(null, "Aplicação Encerrada");
    }
}
