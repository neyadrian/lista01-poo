import java.util.Scanner;

//quest 11
public class DezAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota[] = new double[10];
        double notasTotal = 0.0;
        double media = 0.0;
        int acimaMedia = 0;
        int abaixoMedia = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            nota[i] = sc.nextDouble();
            notasTotal = notasTotal + nota[i];

            if (nota[i] >= 7.0) {
                acimaMedia = acimaMedia + 1;
            } else {
                abaixoMedia = abaixoMedia + 1;
            }
        }

        media = notasTotal / 10.0;

        System.out.println();
        System.out.printf("Média Geral: %.2f\n", media);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos acima da média: " + acimaMedia);

        sc.close();
    }
}
