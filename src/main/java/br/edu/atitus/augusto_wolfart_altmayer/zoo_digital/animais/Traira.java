package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Peixe;

public class Traira extends Peixe implements Nadador, Predador {

    public Traira(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " produz sons graves.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outros peixes menores.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando nas margens do rio à espreita.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está emboscando presas com ataque bote.");
    }
    @Override
    public String getTipo() {
        return "Traíra";
    }
}