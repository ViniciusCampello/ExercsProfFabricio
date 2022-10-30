package ListaExercicios3;

public class Exerc1 {
    public static void main(String[] args) {
        
        Integer i;
        Integer num = 0;
        String saida = "";

        for (i = 1; i <= 100; i++){
            num+=2;
            saida = saida + i + "° " + num + "\n";
        }
        //JOptionPane.showMessageDialog(null, "A primeiros números pares são\n" + saida);
        System.out.println(saida);
    }
}
