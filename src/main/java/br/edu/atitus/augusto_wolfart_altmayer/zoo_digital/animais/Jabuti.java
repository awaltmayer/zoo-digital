package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class Jabuti extends Reptil {

    public Jabuti(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não tem som.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas, frutas e vegetais.");
    }

    @Override
    public String getTipo() {
        return "Jabuti";
    }
}