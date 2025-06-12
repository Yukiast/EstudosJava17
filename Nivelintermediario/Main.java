/*Tudo em Java é um objeto,
toda Classe é um molde para meu objeto
*
*
* */



package Nivelintermediario;

import Nivelintermediario.heranca.FIxarHerancaEX;
import Nivelintermediario.heranca.Uchiha;
import Nivelintermediario.heranca.Uzumaki;

public class Main {

    public static void main (String[] args){

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;
        naruto.modoSabioAtivado();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        FIxarHerancaEX sarada = new FIxarHerancaEX();
        sarada.nome = "Sarada Uchiha";
        sarada.aldeia = "Aldeia da folha";
        sarada.idade = 5;
        sarada.cambalhota();
        sarada.sharinganAtivado();

       /* //aplicando metodo
        sasuke.sharinganAtivado();
        String chamandoMetodo = sasuke.euSouNinja();
        System.out.println(chamandoMetodo);

        int TempoHokage = sasuke.anosParaHOkage(70);
        System.out.println("voce tem "+ sasuke.idade + "entao falta "+ TempoHokage+ "anos para se tornar Hokage");

        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "aldeia da Folha";
        sakura.idade = 17;
*/



    }

}