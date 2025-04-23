import java.util.Random;
import java.util.Scanner;

public class ExercicioUm {
public static void main(String[] args) {
    /*Escreva um programa que faça o computador
     "pensar"em um nmero inteiro entre 0 e 5 e 
     peça o usuario tentar descobri qual foi o 
     numero escolhido pelo pc 
     escreva na tela se o usuario venceu ou perdeu
     */
random random = new Random();
int Pc = random.nextInt(6); 
     
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero de 0 a 5: ");
    int numeroUsuario = scanner.nextInt();
if (Pc == numeroUsuario) {System.out.println("Parabens, voce acertou.");
    
}else{System.out.println("voce errou, o numero era: " + Pc);

}


scanner.close();





    
}
};
