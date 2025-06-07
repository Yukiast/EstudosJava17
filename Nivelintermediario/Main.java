/*Tudo em Java é um objeto,
toda Classe é um molde para meu objeto
*
*
* */



package Nivelintermediario;
public class Main {

    public static void main (String[] args){

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        //aplicando metodo
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouNinja();
        System.out.println(chamandoMetodo);

        int TempoHokage = Sasuke.anosParaHOkage(70);
        System.out.println("voce tem "+ Sasuke.idade + "entao falta "+ TempoHokage+ "anos para se tornar Hokage");

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "aldeia da Folha";
        Sakura.idade = 17;

    }

}