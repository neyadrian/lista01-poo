import java.util.Scanner;

public class BuscarNoVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetor[] = {7, 14, 3, 29, 11, 22, 5, 18, 1, 26};
        int encontrado = 0;
        int posicao = 0;

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if(num == vetor[i]) {
                encontrado = 1;
                posicao = i;
                break;
            }
        }


        if (encontrado == 1) {
            System.out.printf("O número %d está presente no vetor na posição %d!", num, posicao);
        } else {
            System.out.printf("O número %d não está presente no vetor!", num);
        }

        sc.close();
    }
}
