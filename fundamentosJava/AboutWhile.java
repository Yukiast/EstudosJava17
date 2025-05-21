/*
 * while (condição) {o que foi condicionado a acontecer}
 * 
 *  estrutura de repetição usada quando nao sabemos a quantidade de loops exercidos
 * geralmente usada em jogos 
 * 
 */





package fundamentosJava;

public class AboutWhile {
    public static void main(String[] args) {
        
        int numeroDeClones = 0 ;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones ){
            
            numeroDeClones++;

            System.out.println("O Naruto fez um clone das sombras");
        }

    }
    
}
