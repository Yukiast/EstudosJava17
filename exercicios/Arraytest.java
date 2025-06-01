import java.util.Scanner;

public class Arraytest {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int contador = 1;

        String[] nomes = new String[3];

        while (escolha != 3) {

            System.out.println("Bem vindo Ninja:");
            System.out.println("voce deseja: ");
            System.out.println("1 - Cadastrar ninja.");
            System.out.println("2 - Listar NInjas.");
            System.out.println("3 - Sair.");

            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Você pode cadastrar até 10 ninjas.");
                    if (contador < nomes.length) {

                        for (int i = 0; i < 3; i++) {
                            contador += 1;
                            System.out.println("Digite o nome do " + (i + 1) + "° ninja:");
                            nomes[i] = scanner.next();

                        }

                    } else {
                        System.out.println("E o limite de ninjas cadastrados foi atingido.");

                    }

                    break;

                case 2:

                    for (int i = 0; i < 3; i++) {

                        if (nomes[i] != null) {

                            System.out.println(nomes[i]);

                        }
                    }

                    break;

                case 3:

                    System.out.println("Encerrando o Programa. ");

                    break;

                default:
                    System.out.println("Digite a opção do menu:");

                    break;

            }
        }

    }

}
