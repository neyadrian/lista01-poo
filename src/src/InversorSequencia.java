import java.util.Scanner;

// quest 19
public class InversorSequencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String chamada[] = new String[10];

        for (int i = 0; i < chamada.length; i++) {
            System.out.printf("Digite o nome %d: ", i + 1);
            chamada[i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("Lista de alunos em ordem contrária: ");

        for (int i = chamada.length - 1; i >= 0; i--) {
            System.out.println(chamada[i]);
        }

        sc.close();
    }
}
