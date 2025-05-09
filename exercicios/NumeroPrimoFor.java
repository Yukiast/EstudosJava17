import java.util.Scanner;
public class NumeroPrimoFor {

/*faça um programa que leia um numero inteiro e diga se ele é ou nao um numero primo
 * 
*/


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero e verificaremos se ele é um Numero Primo: ");
    int numero = scanner.nextInt(); //2
    
    if (numero <= 1  ) {
        System.out.println("O "+ numero +  " não é primo."); //NÃO TERMINEI

    }else{
        for(int i= 2; i < numero ;i++){
            if ( numero % 2 == 0) {  

                System.out.println("esse numero nao é primo"+ i);
                
            }else if (numero% i==0) {
                
            }
          



        }

    }






    
}


    
}
