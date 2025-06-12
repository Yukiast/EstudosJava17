package Nivelintermediario;



public class Ninja {
    String nome ;
    String aldeia;
    int idade;

    // /*criar um metodo Publico personalizado

    public void sharinganAtivado(){
        System.out.println("O Sharingan Ativou");
    }

    public String euSouNinja() {
        return "Oi eu sou um ninja";

    }
    /*posso criar varios metodos e chamar no programa
    * quando nao preciso que retorne nada vou usar void caso contrario tenho que dar o return
    * */
    public int anosParaHOkage(int idadeMinimaHokage){
        return idadeMinimaHokage - idade ;
    }


}
