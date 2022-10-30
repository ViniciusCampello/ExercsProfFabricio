package ListaExercicios3;

import java.util.Scanner;

public class Exerc4e5 {
    public static void main(String[] args) {
        
        Integer linha;
        Integer i, j;
        Integer opcao = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- Impressor de Pirâmide de Asteriscos ---\n");

        do{
            System.out.println("Digite a quantidade de linhas(Máximo de 20):");
            linha = input.nextInt();
            if (linha > 0 && linha <= 20){
                for (i = 1;i <= linha;i++){
                    for (j = 1;j <= i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("Deseja tentar novamente?");
                System.out.println("(1) Para Continuar\n(2) Para Encerrar Aplicação");
                opcao = input.nextInt();
            }else{
                System.out.println("Número digitado inválido, deseja tentar novamente?");
                System.out.println("(1) Para Continuar\n(2) Para Encerrar Aplicação");
                opcao = input.nextInt();
            }
        }while(opcao == 1);
        System.out.println("Aplicação Encerrada");
        
    }
}
