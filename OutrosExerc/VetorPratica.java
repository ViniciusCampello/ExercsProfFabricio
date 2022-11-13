package OutrosExerc;

import java.util.Scanner;

public class VetorPratica {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer tamanho = -1;
        Integer i;
        Integer num;
        Integer menu = 1;
        Integer menu2 = 1;
        Integer menu3 = 1;
        Integer consulta;

        System.out.println("Insira um número para definir o tamanho do vetor:");
        tamanho = in.nextInt();

        int[] vetor = new int[tamanho];

        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do vetor:");
            vetor[i] = in.nextInt();
        }
        while (menu != 0) {
            System.out.println("---Menu de Opções---\n1. Vetor em Ordem Crescente\n2. Vetor em Ordem Decrescente" +
                    "\n3. Buscar número pelo espaço do vetor\n4. Buscar espaço do vetor pelo número" +
                    "\n0. Sair da Aplicação");
            menu = in.nextInt();
            if (menu == 1) {
                System.out.println("----Ordem Crescente----");
                for (i = 0; i < vetor.length; i++) {
                    System.out.println("O " + (i + 1) + "º número do vetor é " + vetor[i]);
                }
                //Arrays.sort(vetor);
                //System.out.println(Arrays.toString(vetor));
            } else if (menu == 2) {
                System.out.println("----Ordem Decrescente----");
                for (i = vetor.length - 1; i >= 0; i--) {
                    System.out.println("O " + (i + 1) + "º número do vetor é " + vetor[i]);
                }
            } else if (menu == 3) {
                while (menu2 != 0) {
                    System.out.println("Digite um número de espaço de 0 a " + (tamanho - 1) +
                            " para consultar um valor no vetor:");
                    consulta = in.nextInt();
                    if (consulta >= 0 && consulta <= (tamanho - 1)) {
                        System.out.println("O espaço " + consulta + " do vetor é o valor " + vetor[consulta]);
                        System.out.println("1. Continuar\n0. Retornar ao Menu Principal");
                        menu2 = in.nextInt();
                    } else {
                        System.out.println("O número digitado não pertence a um espaço do vetor.");
                        System.out.println("1. Tentar Novamente\n0. Retornar ao Menu Principal");
                        menu2 = in.nextInt();
                    }
                }
            }else if (menu == 4) {
                while (menu3 != 0) {
                    System.out.println("Digite um número para verificar qual espaço ele está:");
                    num = in.nextInt();
                    for (i = 0; i < vetor.length;) {
                        if (num != vetor[i]) {
                            System.out.println("O número " + num  + " não pertence ao espaço " + i);
                            i++;
                        }else if (num == vetor[i]){
                            System.out.println("O número " + num + " pertence ao espaço " + i);
                            break;
                        }
                        //Não consegui pensar uma forma de retornar uma mensagem uma única vez caso o número não pertença ao vetor
                    }
                    System.out.println("1. Tentar Novamente\n0. Retornar ao Menu Principal");
                    menu = in.nextInt();
                }
            }else if (menu == 0) {
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println("Aplicação Encerrada...\nObrigado por Utilizar!");
    }
}
