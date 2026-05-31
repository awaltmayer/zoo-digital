package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Ave;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "quack");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe fresco.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando com agilidade sob o gelo.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando krill no gelo.");
    }
    @Override
    public String getTipo() {
        return "Pinguim";
    }
}