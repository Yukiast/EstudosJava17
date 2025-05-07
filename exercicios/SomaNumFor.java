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


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int somaPares = 0;
    
    for(int i= 1; i<=6; i++ ){              //i=1 de qual numero meu laço vai começar; i<=6 ate a onde o laço vai rodar e i++ foi de incremento  
        
        System.out.println("Digite o " + i + "° numero:"); //sysout dentro do for pra ele repetir o texto com o i pois o i vai acrescentando 1 a cada loop percorrido
        int numero = scanner.nextInt(); //variavel para receber o numero do ususario
        if (numero % 2 == 0 ) {  //declarei que a divisao da variavel por 2 tem que ser =0 o resultado tornado-a par
            somaPares += numero; //criei uma variavel acima e intitulei que somaPares= somaPare+numero ==somaPares+=numeros
        }
    }
    System.out.println("A soma dos numeros pares é = " + somaPares); //sysoutpara imprimir a soma
    scanner.close();

}

}