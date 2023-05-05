import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUsuario;
        System.out.println("Digite um valor: ");
        valorUsuario = sc.nextInt();
        System.out.println("No valor de digitado aparece "+contadorDe2(valorUsuario)+" vezes o valor 2");
    }
    public static int contadorDe2(int valor){
        String valorFormatado =String.valueOf(valor);
        int cont =0;
        for (int i = 0; i < valorFormatado.length(); i++) {
            if (valorFormatado.charAt(i) == '2') {
                cont++;
            }
        }
        return cont;
    }
}
