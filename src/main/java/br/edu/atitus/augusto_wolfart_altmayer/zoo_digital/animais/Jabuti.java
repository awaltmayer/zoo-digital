package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class Jabuti extends Reptil {

    public Jabuti(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite sons graves durante o período de acasalamento.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas, frutas e vegetais.");
    }
}