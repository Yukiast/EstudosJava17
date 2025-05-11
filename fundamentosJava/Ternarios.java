/*?Ternarios são usados para reduzir o codigo
 * variavel = (condição) ? valorSeVerdadeiro : ValorSeFalso;
 * ternario resumidamente é um if and else 2.0 
 * 
 * 
 */





package fundamentosJava;

public class Ternarios {
    public static void main(String[] args) {
        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10 ) ? "Esse ninja esta com mais de 10 missoes " : "esse ninja tem menos de 10 missoes";
        System.out.println(nivel);
}


    
}
