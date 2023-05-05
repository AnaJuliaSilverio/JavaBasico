import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUsuario;
        System.out.println("Digite seu nome: ");
        nomeUsuario = sc.nextLine();
        System.out.println("Ola,"+nomeUsuario+" aqui esta a data de hoje e o horario:");
        dataHora();
    }
    public static void dataHora(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatarData= DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatarData.format(agora);

        DateTimeFormatter formatarHora= DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatarHora.format(agora);

        System.out.println("Data: "+dataFormatada+"\nHora: "+horaFormatada);


    }

}
