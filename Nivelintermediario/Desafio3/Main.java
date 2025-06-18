package Nivelintermediario.Desafio3;

import Nivelintermediario.Desafio3.Herança.Uchiha;

import java.util.Scanner;


public class Main {

    public static void main (String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Infiltrar Akatsuki";
        sasuke.nivelDificuldade =" extremo " ;
        sasuke.statusMissao = "Em andamento";
        sasuke.mostrarInformacoes();


    }
}
