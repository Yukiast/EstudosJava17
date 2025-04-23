import java.util.Scanner;


public class ExercicioOito {
public static void main(String[] args) {
    /*Desenvolva um programa que leia comprimentos
     * de tres retas e diga ao usuário se elas podem
     * ou nao ser um triangulo
     Para que três segmentos de reta formem um triângulo, é preciso que a soma de dois lados seja maior que o terceiro lado
      Esta condição é conhecida como condição de existência do triângulo
     */


Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o menor valor: ");
        double a = scanner.nextInt();

        System.out.println("digite o segundo menor valor: ");
        double b = scanner.nextInt();

        System.out.println("Digite o maior valor: ");
        double c = scanner.nextInt();
    
if (a+b > c ) {
       System.out.println("forma um triângulo");
    
}else{
        System.out.println("Não forma um Triangulo");
};

scanner.close();

}
   
    
}
