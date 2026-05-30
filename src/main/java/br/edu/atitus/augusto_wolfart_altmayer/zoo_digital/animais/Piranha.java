package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Peixe;

public class Piranha extends Peixe implements Nadador, Predador {

    public Piranha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " range os dentes ?.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne com seus dentes afiados.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em cardume nos rios.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está atacando em bando.");
    }
}