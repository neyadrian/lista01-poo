import java.util.Locale;
import java.util.Scanner;

// quest 15
public class altura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura[] = new double[10];
        double totalAltura = 0.0;
        double media;
        double maiorAltura = 0.0;
        double menorAltura = 999.00;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a alura da pessoa %d: ", i + 1);
            altura[i] = sc.nextDouble();

            totalAltura = totalAltura + altura[i];

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        media = totalAltura / 10.0;

        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Média das alturas: %.2f\n", media);

        sc.close();
    }
}
