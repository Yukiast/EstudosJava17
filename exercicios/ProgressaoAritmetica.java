import java.util.Scanner;

public class ProgressaoAritmetica {
/*Desenvolva um progrma que leia o primeiro termo e a
razão de uma PA. No final mostre os 10 primeiros termos 
dessa progressão*/    


/* usuario digitar de onde começoa
 * usuario digitar a razao da pa
 * definir o for
 * printar os 10 primeiros resultados
 */



public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("Digite o inicio da Progressão Aritimetica: ");
  int primeiroTermo = scanner.nextInt();

  System.out.println("Digite a razão da Progressão Aritimetica: ");
  int pa = scanner.nextInt();

  for(int i=1; i<=10;i++){
    
    primeiroTermo += pa;
    System.out.println("O " + i + "° Termo da PA é: "+ primeiroTermo );
    


  }


        }
      }
      



