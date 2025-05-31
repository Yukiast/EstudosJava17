import java.util.Scanner;



public class Arraytest {
   
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        
        
        String[] nomes = new String[3];

        while (escolha =! 3 ) {
            
        
        
        System.out.println("Bem vindo Ninja:");
        System.out.println("voce deseja: ");
        System.out.println("1 - Cadastrar ninja.");
        System.out.println("2 - Listar NInjas.");
        System.out.println("3 - Sair.");
        escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
            System.out.println("Você pode cadastrar até 10 ninjas.");
            System.out.println("Digite o nome de ninja: "); 

            for(int i = 0; i < 3; i++ ) {
            
                if(i<=3){

                    nomes[i]=scanner.next(); 
           }
        }
            
            case 2 :
            


        

            case 3 :
           
            System.out.println("Volte sempre. ");

     


            default:
            
                
            }        }


}

    }
    
}
