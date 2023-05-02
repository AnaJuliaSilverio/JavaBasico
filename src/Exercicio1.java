import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeValores;
        List<Integer> valores = new ArrayList<>();
        System.out.println("Digite a  quantidade de valores desejadas: ");
        quantidadeDeValores = sc.nextInt();

        for (int i = 0; i < quantidadeDeValores; i++) {
            System.out.println("Digite o valor de posicao "+(i+1));
            valores.add(sc.nextInt());
        }
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
        retiraValoresDuplicados(valores);
        System.out.println("Valores duplicados retirados");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
        System.out.println("O tamanho da lista agora é de "+valores.size());
    }
    public static void retiraValoresDuplicados(List<Integer> valores ){
        for (int i = 0; i < valores.size() ; i++) {
            for (int j = i+1; j < valores.size(); j++) {
                if(valores.get(i) ==valores.get(j)){
                    valores.remove(j);
                }
            }
        }
    }


}