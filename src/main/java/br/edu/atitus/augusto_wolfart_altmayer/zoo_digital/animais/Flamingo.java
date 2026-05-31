package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Voador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Ave;

public class Flamingo extends Ave implements Nadador, Voador {

    public Flamingo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite um som alto.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está andando nas águas rasas em busca de comida.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando em bando.");
    }
    @Override
    public String getTipo() {
        return "Flamingo";
    }
}


