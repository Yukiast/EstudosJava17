import java.util.Scanner;
public class NumeroPrimoFor {

/*faça um programa que leia um numero inteiro e diga se ele é ou nao um numero primo */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    for(int i = 1; i<=1 ; i++){
        
        System.out.println("Digite um numero e verificaremos se ele é um Numero Primo: ");
        int numero = scanner.nextInt();

        if (numero%1 == 0 && numero%numero==0 )  {//NAO TERMINEI
            
            System.out.println("O número " + numero + " é primo. ");
            
        }else{
            
            System.out.println("O numero " + numero + "não é primo. ");

        }
    }


    
}


    
}
