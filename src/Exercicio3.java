import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //contem os valores do meu array
        List<Integer> valoresArrayList = new ArrayList<>();
        //contem os valores dos index dos q somandos dao somaEcontrar
        List<Integer> paresSoma = new ArrayList<>();
        int somaEncontrar,cont=0;
        System.out.println("Digite a soma que deseja encontrar: ");
        somaEncontrar = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor da posicao "+(i+1));
            valoresArrayList.add(sc.nextInt());
        }

        for (int i = 0; i < valoresArrayList.size(); i++) {
            for (int j = i+1; j < valoresArrayList.size(); j++) {
                //comparando se a soma dos dois dao igual a somaEncontrar
                if (valoresArrayList.get(i)+valoresArrayList.get(j)==somaEncontrar){
                    //poderia apenas dar um print nos valores da posicao i e j
                    //System.out.println(valoresArrayList.get(i)+" + "+ valoresArrayList.get(j)+" = "+somaEncontrar);
                    //vericando se esse index ja esta no meu vetor
                    if (!(paresSoma.contains(i)&&paresSoma.contains(j))){
                        paresSoma.add(i);
                        paresSoma.add(j);
                    }
                }
            }
        }

        while (cont< paresSoma.size()){
            //recupando o valor com o index presente no paresoma
            System.out.println("O valor "+valoresArrayList.get(paresSoma.get(cont))+" somado com o valor "+valoresArrayList.get(paresSoma.get(cont+1))+ " é igual a "+somaEncontrar);
            //meu contador vai ter q andar de 2 em 2
            cont+=2;
        }


    }
}
