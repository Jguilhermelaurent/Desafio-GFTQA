package dio.com.br.desafio;
import java.io.IOException;
import java.util.Scanner;

public class JogoTempo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim-inicio;

        if(horas == 0) System.out.println("O JOGO DUROU 24 HORA(S)");
        else if(horas < 0) System.out.printf("O JOGO DUROU %d HORA(S)\n",(24-inicio+fim));
        else System.out.printf("O JOGO DUROU %d HORA(S)\n",horas);

        scan.close();
    }
}
