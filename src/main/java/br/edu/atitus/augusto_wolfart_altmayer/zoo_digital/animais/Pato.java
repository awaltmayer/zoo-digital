package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Voador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Ave;

public class Pato extends Ave implements Nadador, Voador {

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " quack");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo grãos.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando tranquilamente no lago.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando em formação migratória.");
    }

    @Override
    public String getTipo() {
        return "Pato";
    }
}