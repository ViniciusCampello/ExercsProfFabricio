package AtividadesJardel;

public class Exercicio14 {
    public static void main(String[] args) {
        
        int[] vetor = new int[51];
        int i;

        for (i = 0; i < vetor.length; i++){
            vetor[i] = i;
        }
        for (i = 0; i < vetor.length; i++){
            System.out.println("O espaço "+i+" do vetor é o número "+vetor[i]);
        }
    }
}
