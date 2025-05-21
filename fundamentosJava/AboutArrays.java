//Arrays(matrizes) - Estrutura de dados + referência de memória + desafio
/* Na Programação tudo começa em 0 o Chamado INDEX
 * Arrays não podem ser modificado apos a criação e listas podem;
 *  os valores padrão são 0, 0.0 e false, respectivamente.
 *  Já para objetos como String ou outros tipos de referência,
 *  o valor padrão é null.
 * 
 * 
 * @3fe
 * 
 */




package fundamentosJava;

public class AboutArrays {
    public static void main(String[] args) {
        
        String[] ninja = new String[5] ; //Toda Vez que for adicionar algo no Array tem adicionar mais ao Slot
        ninja[0] ="Naruto Uzumaki";
        ninja[1] ="Sasuke Uchiha";
        ninja[2] ="Sakura Haruno";
        ninja[3] ="Hinata Hyuga";
        ninja[4] ="Kakashi Hatake";
        

        System.out.println(ninja[1]);


        int[] idade = new int[2];
        idade[0] = 16;

    }
    
}
