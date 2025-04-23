import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        /*Escreva um programa que pergunte o salário
         * de um funcionario e calcule o valor do seu
         * aumento.
         * para Salários superiores a R$1250,00 Calcule um
         * aumento de 10%.
         * para inferiores um de 15%
         */
    
       
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Valor do Salário: ");
    double salario = scanner.nextInt();

    if (salario >= 1250) {
        System.out.println("O valor do salário ficou: R$" + (salario*1.10) + "." + " Aumento de: R$" + (salario*0.10));
        
    }else if (salario < 1250) { 
        System.out.println("O valor do salário ficou: R$" + (salario*1.15) + "." + " Aumento de: R$" + (salario*0.15));
        
    }

        scanner.close();
    }


    }
    

