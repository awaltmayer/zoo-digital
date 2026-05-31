package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class JacareAcu extends Reptil implements Nadador, Predador {

    public JacareAcu(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite rugidos.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando sua presa.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando silenciosamente.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está esperando pacientemente na beira do rio para atacar.");
    }
    @Override
    public String getTipo() {
        return "Jacaré Açu";
    }
}