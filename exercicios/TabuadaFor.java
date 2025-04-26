import java.util.Scanner;


public class TabuadaFor {
/*tabuada com for em que o usuario escreve o valor */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da tabuado que voce deseja");
        int tabuada = scanner.nextInt();
        System.out.println("agora ate quanto deve ser multiplicado:");
        int numero = scanner.nextInt();

        for(int i = 1; i<=numero; i++){
            System.out.println(  i + " x " + tabuada + "= " + tabuada * i);
        }

}



    
}
