import java.util.Scanner;

public class Tesouro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tesouro[][] = {
                {0, 0, 1},
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.print("Digite a linha: ");
        int linha = sc.nextInt();

        System.out.print("Digite a coluna: ");
        int coluna = sc.nextInt();

        if (tesouro[linha][coluna] == 1) {
            System.out.println("Tesouro encontrado!");
        } else {
            System.out.println("Água...");
        }

        sc.close();
    }
}
