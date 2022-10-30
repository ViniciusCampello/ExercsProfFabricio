package ListaExercicios3;

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        
        Integer idade;
        Integer idadeM = 0, idadeH = 0;
        Integer idadeMf = 0, idadeHf = 0;
        Integer contadorM = 0, contadorH = 0;
        Integer sexo;
        Integer i;

        try (Scanner input = new Scanner(System.in)) {
            for (i = 1;i <= 5; i++){
                System.out.println(i + ". Digite a idade da pessoa: ");
                idade = input.nextInt();
                System.out.println(i + ". Digite o sexo dessa pessoa:\n(1) para Mulher e (2) para Homem");
                sexo = input.nextInt();

                if (sexo == 1){
                    contadorM++;
                    idadeM = idadeM + idade;
                }else if (sexo == 2){
                    contadorH++;
                    idadeH = idadeH + idade;
                }
            }
        }
        idadeMf = idadeM / contadorM;
        idadeHf = idadeH / contadorH;
            
        System.out.println("A média de idade da população feminina informada é de " + idadeMf);
        System.out.println("A média de idade da população masculina informada é de " + idadeHf);
    }
}

