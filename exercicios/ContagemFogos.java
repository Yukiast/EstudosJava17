import java.util.Scanner;

public class ContagemFogos {

    /*faça um programa que mostre na tela uma contagem regressiva
 * para o esouro de fogos de artificio.indo de 10 ate 0. 
 * com uma pausa de 1 segundo entre elas.
 */


public class fatorial {


/*public static void pausa(){
        try{ Thread.sleep(1000);

        }catch(InterruptedException e){
            System.out.println("contagem interrompida.");
            Thread.currentThread().interrupt();
        }

    

}*/






    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Para começar a contagem digite: 1");
        
        int comando = scanner.nextInt();
    
        if (comando == 1) {
            
            System.out.println("Iniciando a contagem:");
            try{ Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println("contagem interrompida.");
                Thread.currentThread().interrupt();
                }

            for(int i = 10 ; i >= 0 ; i--){
                
                System.out.println(i);
                try{ Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("contagem interrompida.");
                    Thread.currentThread().interrupt();
                }
                
        }   
            System.out.println("Lançado!!!");
            
            }else{
                
                System.out.println("O comando foi invalido.");
            }
                   
            
    }
        
}
  
}
