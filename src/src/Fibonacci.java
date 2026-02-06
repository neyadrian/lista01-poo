//quest 08
public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 1;
        int proximo;

        System.out.print(n1 + ", " + n2);

        for (int i = 3; i <= 30; i++) {
            proximo = n1 + n2;
            System.out.print(", " + proximo);

            n1 = n2;
            n2 = proximo;
        }
    }
}
