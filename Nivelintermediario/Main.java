/*Tudo em Java é um objeto,
toda Classe é um molde para meu objeto
*
*
* */



package Nivelintermediario;
public class Main {

    public static void main (String[] args){

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;

        //aplicando metodo
        sasuke.sharinganAtivado();
        String chamandoMetodo = sasuke.euSouNinja();
        System.out.println(chamandoMetodo);

        int TempoHokage = sasuke.anosParaHOkage(70);
        System.out.println("voce tem "+ sasuke.idade + "entao falta "+ TempoHokage+ "anos para se tornar Hokage");

        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "aldeia da Folha";
        sakura.idade = 17;

    }

}