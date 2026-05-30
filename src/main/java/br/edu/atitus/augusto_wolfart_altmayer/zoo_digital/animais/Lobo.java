package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Mamifero;

public class Lobo extends Mamifero implements Corredor, Predador {

    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Uinvando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo a presa que caçou.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo em matilha pela floresta.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em grupo, cercando a presa.");
    }
}