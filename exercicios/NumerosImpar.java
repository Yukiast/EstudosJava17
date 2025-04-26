/*faça um programa que calcule a soma de todos os numeros impares que sao multiplos de 3 e que se encontram no intevalo de 1 a 500 */


public class NumerosImpar {

    public static void main(String[] args) {
        int valor = 0;
        for(int i =0; i <= 500 ; i++){
            if (i%3 == 0 && i% 2 > 0 ){
                valor = valor + i;
            }
            
           
        }
        System.out.println("O numero é " +valor);
            
    }

}
    




    

