import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        List<Integer> valoresArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor da posicao "+(i+1));
            valoresArrayList.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(valoresArrayList.get(i));
        }

        for (int i = 0; i <valoresArrayList.size() ; i++) {
            if (valoresArrayList.get(i)<0){
                valor = valoresArrayList.get(i);
                valoresArrayList.remove(i);
                valoresArrayList.add(0,valor);
            }
        }
        System.out.println("Valores negativos primeiro");
        for (int i = 0; i < 5; i++) {
            System.out.println(valoresArrayList.get(i));
        }
    }
}
