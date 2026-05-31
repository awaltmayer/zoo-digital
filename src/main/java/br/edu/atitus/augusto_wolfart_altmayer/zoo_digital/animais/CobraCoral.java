package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class CobraCoral extends Reptil implements Predador {

    public CobraCoral(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ela nem tem som?.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está digerindo a presa.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está injetando veneno em sua presa.");
    }
    @Override
    public String getTipo() {
        return "Cobra coral";
    }
}