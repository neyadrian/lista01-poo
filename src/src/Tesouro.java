import java.util.Scanner;

// quest 21
public class Tesouro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tesouro[][] = {
                {0, 0, 1},
                {0, 0, 0},
                {0, 0, 0}
        };
        int cacador[][] = new int[1][1];


        for (int i = 0; i <= cacador.length; i++) {
            for (int j = 0; j <= cacador.length; j++) {
                System.out.print("Digite uma posição: ");
                cacador[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= tesouro.length; i++) {
            for (int j = 0; j <= tesouro.length; j++) {
                if (cacador[i][j] == tesouro[0][2]) {
                    System.out.println("Tesouro encontrado!");
                } else {
                    System.out.println("Água...");
                }
            }
        }

        sc.close();
    }
}
