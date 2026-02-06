import java.util.Scanner;

// quest 09
public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int tabuada = 0;

        System.out.println();
        System.out.println("Tabudada do número: " + num);
        for (int i = 0; i <= 10; i++) {
            tabuada = i * num;
            System.out.printf("%d x %d = %d\n", i, num, tabuada);
        }

        sc.close();
    }
}
