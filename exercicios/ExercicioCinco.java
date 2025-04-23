import java.util.Scanner;

public class ExercicioCinco {
  public static void main(String[] args) {
    /*faça um programa que leia um ano qualquer
    e mostre se ele é Bissexto
     */    
Scanner scanner = new Scanner(System.in);
    System.out.print("Favor inserir o ano: ");
    int Ano = scanner.nextInt();
    int StepOne = Ano%4;
if(StepOne == 0 ){
    System.out.println("O ano de " + Ano + " é bissexto.");

}else{
    System.out.print("O Ano de " + Ano + " não é Bissexto.");
}
scanner.close();

  }  
}
