package Nivelintermediario.Desafio3.Herança;

import Nivelintermediario.Desafio3.Ninja;

public class Uchiha extends Ninja {
    public String habilidadeEspecial = "Sharingan";

    public void mostrarHabilidadeEspecial(){
        System.out.println("Soltando a habilidade especial:" + habilidadeEspecial);

        }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("NIvel de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        mostrarHabilidadeEspecial();

    }
}
