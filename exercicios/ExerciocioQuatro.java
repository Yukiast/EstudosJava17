import java.util.Scanner;

public class ExerciocioQuatro {
  public static void main(String[] args) {
    /*Desenvolva um programa que pergunte a 
     * distancia de uma viagem e km.
     * Calcule o preço da passagem cobrando 0,50
     * por km para viagens ate 200km e 0,45 para 
     * mais longa.
     */
Scanner scanner = new Scanner(System.in);
    System.out.print("favor digitar a Quilometragem: ");
double Valor = scanner.nextInt();
double ValorNormal = (Valor * 0.50) ;
double ValorDesconto = (Valor * 0.45);

if(Valor <= 200 ){
    System.out.println("A tarifa ficou no Valor de R$ " + ValorNormal + " Reais.");
}else{
    System.out.println("A tarifa ficou no Valor de R$ " + ValorDesconto + " Reais.");
}

scanner.close();

  }  
}
