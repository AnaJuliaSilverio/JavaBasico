import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String primeiroValorUsuario;
        String segundoValorUsuario;
        System.out.println("Digite a primeira palavra: ");
        primeiroValorUsuario = sc.next();
        System.out.println("Digite a segunda palavra: ");
        segundoValorUsuario = sc.next();

        boolean comparaStrings= primeiroValorUsuario.equalsIgnoreCase(segundoValorUsuario);
        if (comparaStrings){
            System.out.println("A palavra "+primeiroValorUsuario+" e a palavra "+segundoValorUsuario+" são iguais");
        }else{
            System.out.println("A palavra "+primeiroValorUsuario+" e a palavra "+segundoValorUsuario+" são diferentes");
        }
    }
}
