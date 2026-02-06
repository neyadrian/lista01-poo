import java.util.Scanner;

//quest 16
public class Piramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        String asterisco = " ";

        for (int i = 0; i < num; i++) {
            asterisco = asterisco + "*";

            System.out.println(asterisco);
        }

        sc.close();
    }
}
