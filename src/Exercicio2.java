import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] valoresArray = new int[5];
        List<Integer> valoresArrayList = new ArrayList<>();

        //populando o valoresArray
        for (int i = 0; i < valoresArray.length; i++) {
            valoresArray[i] = i+10;
        }
        //primeira Solucao e passar os valores pro valoresArrayList

        for (int i = 0; i < valoresArray.length; i++) {
            valoresArrayList.add(valoresArray[i]);
        }
        for (int i = 0; i < valoresArrayList.size(); i++) {
            System.out.println(valoresArrayList.get(i));
        }

        //solucao usando as a list
        //Agora nosso array tem q ser um Wrapper
        System.out.println("USANDO AS LIST");
        Integer[] valores = new Integer[]{1,2,3,4,5};
        //O método asList retorna uma lista de tamanho fixo gerada pelo array especificado.
        List<Integer> valoresList = new ArrayList<>(Arrays.asList(valores));
        for (int i = 0; i < valoresList.size(); i++) {
            System.out.println(valoresList.get(i));
        }
    }
}
