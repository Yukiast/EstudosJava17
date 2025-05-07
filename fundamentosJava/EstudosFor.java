package fundamentosJava;

/* for(inicialização; condição ; incremento/decremento){}
        inicialização: da onde o vai começar o meu laço
        condição: quantidade de numeros que meu laço for ler
        

 * i = i + 1   = i++(acrescenta 1 no i ate chegar na condição )
 * 1°   i= 0 + 1 = 1    (i se tornorou 1)
 * 2°   i =1 + 1 = 2    (i se tornorou 2)
 * 3°   ............    (i se tornorou ...)
 */





public class EstudosFor { 

    public static void main (String[] args){

        for(int i = 10 ; i <= 0 ; i++){
            System.out.println("o numero é "+ i);
        }

        for (int i = 0; i <= 10; i = i + 2) { //outro tipo de for onde tem o acrescimo
            System.out.println(i);
          }

        for (int i = 0; i < 10; i++) { // break interrompe o ciclo quando o for alcança o parametro estipulado
        if (i == 4) {
            break;
        }
        System.out.println(i);

    }
        for (int i = 0; i < 10; i++) {//continue ele vai continuar a sequencia quando chegar no estipulado e pular o valor adotado
            if (i == 4) {
            continue;
            }
            System.out.println(i);
        }


}
}