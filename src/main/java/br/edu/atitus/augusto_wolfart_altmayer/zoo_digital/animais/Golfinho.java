package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Mamifero;

public class Golfinho extends Mamifero implements Nadador, Predador {

    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Click click squeak!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes e lulas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando e saltando nas ondas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes em grupo usando ecolocalização.");
    }
}