/*Verificador de Números:

Crie um método positivo(int numero) que recebe um número inteiro e retorna true se o número for positivo e false caso contrário.
Crie um método par(int numero) que recebe um número inteiro e retorna true se o número for par e false caso contrário.
No método main, peça ao usuário para inserir um número e utilize os métodos para informar se o número é positivo e se é par. */


import java.util.Scanner;


public class testeDeNumero {
    
    
    public static boolean positivo(int numero){
        return numero >0;
    }

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("favor digitar um numero para verificação:");
                int numero = scanner.nextInt(); 
        if(numero ==0){
            System.out.println("O numero zero é invalido, digite outro numero.");
        }

        else if (positivo(numero)) {

            System.out.println("positivo true.");
        
        }else{

            System.out.println("positivo false.");

        if (par(numero)) {

            System.out.println("Par true");
            
        }else{
            
            System.out.println("Par false.");
        }


        }

     



    }







}

    

