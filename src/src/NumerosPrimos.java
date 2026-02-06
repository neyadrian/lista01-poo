import java.util.Scanner;

// quest 10
public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Números primos de 1 a 100: ");

        for (int i = 2; i <= 100; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
