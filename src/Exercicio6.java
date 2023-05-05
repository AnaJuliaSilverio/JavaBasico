import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeDigUsuario;
        System.out.println("Digite uma palavra: ");
        nomeDigUsuario = sc.next();
        charDoMeio(nomeDigUsuario);

    }
    public static void charDoMeio(String nome){
        int indexCharMeio;
        indexCharMeio = nome.length()/2;
        nome = nome.toUpperCase();
        if (nome.length()%2!=0){
            System.out.println("O char do meio e "+nome.charAt(indexCharMeio));
        }
        else {
            System.out.println("O char do meio é "+nome.charAt(indexCharMeio)+ " e "+nome.charAt(indexCharMeio+1));
        }

    }
}
