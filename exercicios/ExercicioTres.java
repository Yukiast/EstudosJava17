import java.util.Scanner;


public class ExercicioTres {
    public static void main(String[] args) {
        /*Crie um programa que leia um numero
         * inteiro e mostre na tela se ele é par
         * ou impar.
         */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Favor digite um numero: ");
    int Numero = scanner.nextInt();
    int Par = Numero%2  ;

if(Par == 0 ){
    System.out.print("O numero é Par.");

}else{
    System.out.print("O numero é Impar");

}

scanner.close();

    }
}
