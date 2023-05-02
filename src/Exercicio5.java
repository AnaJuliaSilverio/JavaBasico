import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valoresA = new ArrayList<>();
        List<Integer> valoresB = new ArrayList<>();
        List<Integer> merge = new ArrayList<>();

        valoresA.add(1);
        valoresA.add(5);
        valoresA.add(6);
        valoresA.add(7);
        valoresB.add(6);
        valoresB.add(2);
        valoresB.add(4);

        //pegando tamanho de A
        int tamanhoA = valoresA.size();

        //primeiro remover os duplicados
        valoresA.removeAll(valoresB);

        //merge no A e B
        merge.addAll(valoresA);
        merge.addAll(valoresB);

        //colocando em ordem
        Collections.sort(merge);

        //limpando vetores A e B
        valoresA.removeAll(valoresA);
        valoresB.removeAll(valoresB);
        //adicionando primeiros p elementos em A
        for (int i = 0; i < tamanhoA; i++) {
            valoresA.add(merge.get(i));
        }
        //adicionando resto dos elementos
        for (int i = tamanhoA; i < merge.size(); i++) {
            valoresB.add(merge.get(i));
        }
        System.out.println("VALORES A ");
        for (int i = 0; i < valoresA.size(); i++) {
            System.out.println(valoresA.get(i));
        }
        System.out.println("VALORES B ");
        for (int i = 0; i < valoresB.size(); i++) {
            System.out.println(valoresB.get(i));
        }


    }
}
