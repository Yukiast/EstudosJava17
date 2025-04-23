import java.util.Scanner;




public class ExerciocioDois {
public static void main(String[] args) {
        /*Escreva um programa que leia a velocidade
         * de um carro.Se ele ultrapassar 80km/h
         * mensagem dizendo que ele foi multado
         * a multa custa Rs7,00 por cada km acima do 
         * limite.
         */
    int VelocidadeMaxima = 80; 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a Velocidade: ");
    double Velocidade = scanner.nextDouble();
    double Pagamento = (Velocidade- VelocidadeMaxima)*7;

if(Velocidade <= VelocidadeMaxima){System.out.print("Dentro do Limite. ");

}
else{System.out.printf("O limite de velocidade excedeu, Multa de R$%.2f%n ", Pagamento ) ;
    }
    scanner.close();

    }
   
}
