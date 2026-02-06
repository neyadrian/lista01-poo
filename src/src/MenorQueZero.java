import java.util.Scanner;

//quest 12
public class MenorQueZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero = 0.0;
        int quant = 0;
        double todosNumeros = 0.0;
        double media = 0.0;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        do {
            System.out.print("Digite outro número: ");
            numero = sc.nextInt();

            todosNumeros = todosNumeros + numero;
            quant = quant + 1;

        } while (numero > 0);

        media = (double) todosNumeros / quant;

        System.out.printf("Quantidade de números digitados: %d\n", quant);
        System.out.printf("Média dos númeors digitados: %.2f\n", media);

        sc.close();
    }
}
