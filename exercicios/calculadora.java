/*Calculadora Simples:
Crie métodos para realizar as quatro operações aritméticas básicas:
 somar(double a, double b), subtrair(double a, double b), multiplicar(double a, double b),
  e dividir(double a, double b).
Cada método deve receber dois números como entrada e retornar o resultado da operação.
No método main, peça ao usuário para inserir dois números e a operação desejada, e utilize os métodos 
criados para exibir o resultado. */

import java.util.Scanner;
public class calculadora {
    
    public static double somar(double a , double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a Calculado");
        System.out.println("favor digite o primeiro numero: ");
        double numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        double numeroDois = scanner.nextInt();

        System.out.println("Otimo, agora selecione a operação:");
        System.out.println("Para adição Digite 1.");
        System.out.println("Para subtração Digite 2.");
        System.out.println("Para multiplicação  Digite 3.");
        System.out.println("Para divisão Digite 4.");
        int operacao = scanner.nextInt();
        

        double resultado = 0;
        

        switch (operacao) {
            case 1:
                resultado = somar(numeroUm, numeroDois);
                System.out.println("O resultado de " + numeroUm + "+ " + numeroDois + "=" + resultado);
            
                break;
            
            case 2:
                resultado = subtrair(numeroUm, numeroDois);
                System.out.println("O resultado de " + numeroUm + "- " + numeroDois + "=" + resultado);
            
                break;
            
            case 3:
                resultado = multiplicar(numeroUm, numeroDois);
                System.out.println("O resultado de " + numeroUm + "x " + numeroDois + "=" + resultado);
            
                break;
                
            case 4:
                if (numeroDois == 0) {
                    System.out.println("OPERAÇÃO INDEFINIDA, NÃO EXISTEM NUMEROS DIVISIVEIS POR ZERO");

                }else{

                resultado = dividir(numeroUm, numeroDois);
                System.out.println("O resultado de " + numeroUm + "/ " + numeroDois + "=" + resultado);
                
            }
                break;
            

            default:
                System.out.println("o numero digitado esta errado!");
               
                break;
        }
    
    }




    
}

/*Calculadora Simples:
Crie métodos para realizar as quatro operações aritméticas básicas:
 somar(double a, double b), subtrair(double a, double b), multiplicar(double a, double b),
  e dividir(double a, double b).
Cada método deve receber dois números como entrada e retornar o resultado da operação.
No método main, peça ao usuário para inserir dois números e a operação desejada, e utilize os métodos 
criados para exibir o resultado. */