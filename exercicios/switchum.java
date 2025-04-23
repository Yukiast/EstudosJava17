import java.util.Scanner;

public class switchum{
    public static void main(String[] args) {
        /*Desenvolva um programa que receba como entrada um número inteiro que represente um dos 7 dias da semana e imprima na
         tela se esse dia é útil, final de semana ou inválido.
        Considere que Domingo é o dia 1 e Sábado o dia 7. */    
    
        Scanner scanner =new Scanner(System.in);
            System.out.println("Digite um numero para verificação: ");
                int numero = scanner.nextInt();

                switch(numero){
                    case 1:
                    System.out.println("O dia da semana é Domingo!");
                    break;

                    case 2:
                    System.out.println("O dia da semana é Segunda!");
                    break;

                    case 3:
                    System.out.println("O dia da semana é Terça!");
                    break;

                    case 4:
                    System.out.println("O dia da semana é Quarta!");
                    break;

                    case 5:
                    System.out.println("O dia da semana é Quinta!");
                    break;

                    case 6:
                    System.out.println("O dia da semana é Sexta!");
                    break;

                    case 7:
                    System.out.println("O dia da semana é Sabado!");
                    break;
                    
                    default:
                    System.out.println("Numero inválido");
                    

                }
                  

    }
   

}