import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorEmMinutos;
        double valorEmDias,valorEmMeses;
        System.out.println("Digite o valor em minutos");
        valorEmMinutos= sc.nextInt();
        valorEmDias = valorEmMinutos*0.000694444;
        valorEmMeses= valorEmDias/30;
        System.out.printf("O valor em dias é %.0f\nO valor em meses é %.0f\n",valorEmDias,valorEmMeses);


    }
}
