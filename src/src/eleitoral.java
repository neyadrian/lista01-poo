import java.util.Scanner;

public class eleitoral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade <= 17 || idade > 65) {
            System.out.println("Votar é facultativo!");
        } else {
            System.out.println("Votar é obrigatório!");
        }

        sc.close();
    }
}
