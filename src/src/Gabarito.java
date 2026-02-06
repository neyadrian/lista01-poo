import java.util.Scanner;

// quest 20
public class Gabarito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String gabarito[] = {"B", "C", "E", "A", "D"};
        String gabaritoAluno[] = new String[5];
        int nota = 0;

        System.out.println("Digite seu gabarito: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d: ", i + 1);
            gabaritoAluno[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++ ) {
            if(gabaritoAluno[i].equals(gabarito[i])) {
                nota = nota + 2;
            }
        }

        System.out.println("Sua nota foi de: " + nota);

        sc.close();
    }
}
