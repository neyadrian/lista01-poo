import java.util.Scanner;

// quest 14
public class TabuadaDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int tabuada;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Erro: número fora do intervalo permitido.");
            }

        } while (num < 1 || num > 10);

        System.out.println();
        System.out.println("Tabudada do número: " + num);
        for (int i = 0; i <= 10; i++) {
            tabuada = i * num;
            System.out.printf("%d x %d = %d\n", i, num, tabuada);
        }

        sc.close();
    }
}
