package dio.com.br.desafio;

import java.io.IOException;
import java.util.Scanner;

public class FitsOrNotI {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String A, B;
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            A = scan.next();
            B = scan.next();
            if (A.endsWith(B)) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }
        scan.close();
    }
}
