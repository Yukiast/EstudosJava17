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
        //Redeclarar Array
        ninja = new String[7]; //quando transcrevo o meu array o anterior sobescreve que é o garbage collecttor.
        ninja[0] ="Hashirama Senju";
        ninja[1] ="Tobirama Senju";
        ninja[2] ="hiruzen Sarutobi";
        ninja[3] ="Minato Namikaze";
        ninja[4] ="Tsunade";
        ninja[5] ="Kakashi Hatake";
        ninja[6] ="Naruto Uzumaki";      
        System.out.println(ninja[10]);

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        int[] idade = new int[2];
        idade[0] = 16;

    }
    
}
