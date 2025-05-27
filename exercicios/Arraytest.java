import java.util.Scanner;



public class Arraytest {
   
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        
        
        
        while (escolha <= 0 || escolha >3 ) {
            
        
        
        System.out.println("Bem vindo Ninja:");
        System.out.println("voce deseja: ");
        System.out.println("1 - Cadastrar ninja.");
        System.out.println("2 - Listar NInjas.");
        System.out.println("3 - Sair.");
        escolha = scanner.nextInt();
        }
        switch (escolha) {
            case 1:
            System.out.println("Então vamos ao Cadastro: ");
            System.out.println("Digite o nome do ninja: "); 
            String[] nomes = new String[10];   

            for(int i = 0; i < 10; i++ ) {
            if(i<=10){
                nomes[i]=scanner.next(); 
        
            }
        }
            case 2 :
            
//ola
            break;
        
            default:
                break;
        }




    }
    
}
