import java.util.Scanner;


public class ExerciocioSeis {
public static void main(String[] args) {
     /*faça um programa que leia 3 numeros
      * e mostre qual o maior e o menor.
      */
Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero: ");
int numeroUm = scanner.nextInt();

    System.out.println("Digite o segundo numero: ");
int numeroDois = scanner.nextInt();

    System.out.println("Digite o terceiro numero: ");
int numeroTres = scanner.nextInt();

if(numeroUm<numeroDois && numeroUm<numeroTres){
    System.out.println("O menor numero é: "+ numeroUm);

}else if (numeroDois<numeroUm && numeroDois<numeroTres) {
    System.out.println("O menor numero é: "+ numeroDois);
    
}else if (numeroTres<numeroUm && numeroTres<numeroDois) {
    System.out.println("O menor numero é: "+ numeroTres);

}

if (numeroUm>numeroDois && numeroUm>numeroTres) {
    System.out.println("O maior numero é: "+ numeroUm);
    
}else if (numeroDois>numeroUm && numeroDois>numeroTres) {
    System.out.println("O maior numero é: "+ numeroDois); 

}else if (numeroTres>numeroUm && numeroTres>numeroDois) {
    System.out.println("O maior numero é: "+ numeroTres); 
    
}

scanner.close();
}



}
    

