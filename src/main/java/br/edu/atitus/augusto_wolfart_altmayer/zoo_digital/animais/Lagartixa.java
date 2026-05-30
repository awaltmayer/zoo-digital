package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class Lagartixa extends Reptil implements Corredor, Predador {

    public Lagartixa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Tch tch tch! (cliques vocais)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos e mosquitos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela parede verticalmente.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando insetos com sua língua veloz.");
    }
}