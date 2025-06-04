/*Array 2d
 * Ou seja uma matriz, onde o array esta dentro de outro array
 * ele é definido por
 * String[] [] nome = new String [linha] [coluna];
 * 
 */



package fundamentosJava;

public class AboutArrays2D {
    public static void main(String[] args) {
        String[] [] ninjasEAldeias = new String [3] [3];
        
        ninjasEAldeias [0] [0] = "Konoha";
        ninjasEAldeias [0] [1] = "Naruto Uzumaki";  
        ninjasEAldeias [0] [2] = "Sasuke Uchiha";
        
        ninjasEAldeias [1] [0] = "Nevoa";
        ninjasEAldeias [1] [1] = "Zabuza";  
        ninjasEAldeias [1] [2] = "Sasuke Uchiha";
        
        ninjasEAldeias [2] [0] = "Deserto";
        ninjasEAldeias [2] [1] = "Gaara";  
        ninjasEAldeias [2] [2] = "Temari";

       
       for(int i = 0; i < ninjasEAldeias.length; i++){
       
        System.out.println(ninjasEAldeias[i] [i]);
    }
        
    }

}
