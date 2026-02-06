import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        String[][] agenda = new String[31][24];

        
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                agenda[i][j] = "";
            }
        }

        while (true) {
            System.out.println("\n---MENU---");
            System.out.println("1. Agendar compromisso");
            System.out.println("2. Consultar compromisso");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("informe o dia: ");
                int dia = leitor.nextInt();
                System.out.print("informe a hora: ");
                int hora = leitor.nextInt();
                leitor.nextLine();

                if (dia < 1 || dia > 30 || hora < 0 || hora > 23) {
                    System.out.println("Dia ou hora inválidos!");
                } else {
                    if (!agenda[dia][hora].isEmpty()) {
                        System.out.println("Já existe um compromisso nesse horario");
                    } else {
                        System.out.print("Digite a descrição do compromisso: ");
                        String desc = leitor.nextLine();
                        agenda[dia][hora] = desc;
                        System.out.println("Compromisso agendado.");
                    }
                }

            } else if (opcao == 2) {
                System.out.print("informe o dia: ");
                int dia = leitor.nextInt();
                System.out.print("informe o hora: ");
                int hora = leitor.nextInt();

                if (dia < 1 || dia > 30 || hora < 0 || hora > 23) {
                    System.out.println("Dia ou hora invalidos");
                } else {
                    String compromisso = agenda[dia][hora];
                    if (compromisso.isEmpty()) {
                        System.out.println("Nenhum compromisso agendado.");
                    } else {
                        System.out.println("Compromisso: " + compromisso);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("saindo..");
                break;
            } else {
                System.out.println("Opçao invalida!");
            }
        }

        leitor.close();
    }
}
