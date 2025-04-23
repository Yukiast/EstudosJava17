import java.util.Scanner;

public class switchDois {
    public static void main(String[] args) {
        /*Suponha que você esteja desenvolvendo o sistema de um hotel que deva exibir mensagens na recepção para diferentes ações dos hospedes, são elas:
        Fazer Check-in
        Chamar serviço de quarto
        Fazer pedido */
Scanner scanner = new Scanner(System.in); 
System.out.println("Olá com quem eu estou falando?");
String nome = scanner.nextLine();
System.out.println("Ola " + nome +", " +"seja bem vindo!");
System.out.println("Para fazer o Check-in, digite 1! ");
System.out.println("Para chamar o serviço de quarto, digite 2!");
System.out.println("Para fazer um pedido, digite 3! ");
int servico = scanner.nextInt();

switch (servico) {
    case 1:
        System.out.println("Certo, voce selecionou o check-in. favor digite o dia:");
        int dia =scanner.nextInt();

        System.out.println("Agora digite o mes: ");
        int mes = scanner.nextInt();

        System.out.println("O Ano: ");
        int ano =scanner.nextInt();

        System.out.println("Perfeito, seu check-in ficou para o dia " + dia + "/"+ mes +"/"+ ano );
        System.out.println("Até breve!!");
        break;

    case 2:
        System.out.println("perfeito! Vi que selecionou o serviço de quarto. Como podemos ajuda-lo?");
        System.out.println("Para limpeza e roupas de cama e banho Digite 1");
        System.out.println("para fazer um pedido do cardapio digite 2");
        int serviçoDeQuarto =scanner.nextInt();
        scanner.nextLine();
        if (serviçoDeQuarto == 1 ) {
            System.out.println("Estamos encaminhando a camareira para seu quarto !");
                        
        }else{
            System.out.println("O que gostaria do Cardapio?");
            String pedido = scanner.nextLine();
            System.out.print("O prato "+ pedido);
            System.out.print(" foi encaminhado para cozinha e em breve chegara ao seu Quarto.");
        }
        break;
    case 3:
        scanner.nextLine();
        System.out.print("Em que podemos auxilia-lo? ");
        String pedidoCliente = scanner.nextLine();
        System.out.println("O seu pedido foi encaminhado para o Mannager, em breve ele entrara em contato.");
        break;
    default:
        System.out.println("Não compreendi, poderia digitar a opção novamente?");
        break;
}

    }
    
}
