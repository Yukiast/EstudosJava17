import java.util.Scanner;

public class SomaNumFor {
/*Desenvolva um programa que leia seis numeros inteiros e
 mostre a soma apenas daqueles que forem pares 
 se o valor for impar desconsidere-o*/    


 /*fazer o usuario digitar 6 numeros
 * fazer a maquina percorrer os seis numeros
 * validação dos pares
 * somar os pares
 * printar na tela
 * 
 * 
 */






/**
 *
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite Seis numeros inteiros para a soma: ");
    int primeiroNumero = scanner.nextInt();
    int segundoNumero = scanner.nextInt();
    int terceiroNumero = scanner.nextInt();
    int quartoNumero = scanner.nextInt();
    int quintoNumero= scanner.nextInt();
    int sextoNumero = scanner.nextInt();
    int[] myNumb = {primeiroNumero,segundoNumero,terceiroNumero,quartoNumero,quintoNumero,sextoNumero} ;
    



    


    for(int i=0 ; i %2 ==0 ; i = primeiroNumero){
    System.out.println("numeero"+ i);
    }


}

@Override
public String toString() {
    return "SomaNumFor []";
}
}