package ListaExercicios2;

import javax.swing.JOptionPane;

public class Exerc4 {
    public static void main(String[] args) {
        
        String candC1 = "Paulo", candC2 = "João", candC3 = "Maria", candC4 = "Clara";
        Integer votoC1 = 0, votoC2 = 0, votoC3 = 0, votoC4 = 0;
        Integer voto;
        Integer votoNulo = 0;
        Integer votoTotal = 0;

        JOptionPane.showMessageDialog(null, "Canditados Disponíveis\n1."+candC1+"\n2."+candC2+"\n3."+candC3+"\n4."+candC4+"\n5.Voto Nulo\n0.Encerrar Aplicação", 
        "Urna Eletrônica", JOptionPane.INFORMATION_MESSAGE, null);
        voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a quem deseja votar: "));

        while (voto > 0){
            if (voto == 1){
                votoC1++;
                JOptionPane.showMessageDialog(null, "Voto computado para candidato(a) " + candC1);
            }else if (voto == 2){
                votoC2++;
                JOptionPane.showMessageDialog(null, "Voto computado para candidato(a) " + candC2);
            }else if (voto == 3){
                votoC3++;
                JOptionPane.showMessageDialog(null, "Voto computado para candidato(a) " + candC3);
            }else if (voto == 4){
                votoC4++;
                JOptionPane.showMessageDialog(null, "Voto computado para candidato(a) " + candC4);
            }else if (voto == 5){
                votoNulo++;
                JOptionPane.showMessageDialog(null, "Voto Nulo computado.");
            }else{
                JOptionPane.showMessageDialog(null, "Número digitado inválido.");
            }
            if (voto == 1 || voto == 2 || voto == 3 || voto == 4 || voto == 5){votoTotal++;}
            voto = Integer.parseInt(JOptionPane.showInputDialog("Vote Novamente\n1."+candC1+"\n2."+candC2+"\n3."+candC3+"\n4."+candC4+"\n5.Voto Nulo\n0.Encerrar Aplicação"));
        }
        JOptionPane.showMessageDialog(null, "Votação Encerrada");
        JOptionPane.showMessageDialog(null, "Contagem de Votos!!\nVotos Totais: " + votoTotal + " votos." +
                                            "\nCandidato(a) "+candC1+":" + votoC1 + " votos." +
                                            "\nCandidato(a) "+candC2+":" + votoC2 + " votos." +
                                            "\nCandidato(a) "+candC3+":" + votoC3 + " votos." +
                                            "\nCandidato(a) "+candC4+":" + votoC4 + " votos." +
                                            "\nVoto Nulo: " + votoNulo + " votos.");
    }
}
