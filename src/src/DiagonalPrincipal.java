import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int matriz[][] = new int[n][n];

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();

                if (i == j) {
                    somaPrincipal += matriz[i][j];
                }

                if (i + j == n - 1) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        sc.close();
    }
}
