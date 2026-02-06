import java.util.Scanner;

//quest 18
public class ParesEImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];
        int vetorPares[] = new int[10];
        int vetorImpares[] = new int[10];

        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                vetorPares[contPares] = vetor[i];
                contPares++;
            } else {
                vetorImpares[contImpares] = vetor[i];
                contImpares++;
            }
        }

        System.out.println();
        System.out.println("Vetor principal:");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d |", vetor[i]);
        }

        System.out.println();
        System.out.println("Vetor pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.printf(" %d |", vetorPares[i]);
        }

        System.out.println();
        System.out.println("Vetor ímpares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.printf(" %d |", vetorImpares[i]);
        }

        sc.close();
    }
}
