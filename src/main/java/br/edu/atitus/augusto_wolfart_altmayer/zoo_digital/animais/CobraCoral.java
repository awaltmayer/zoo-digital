package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Reptil;

public class CobraCoral extends Reptil implements Predador {

    public CobraCoral(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite som, mas sibila ameaçadoramente.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo a presa inteira lentamente.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está injetando veneno neurotóxico em sua presa.");
    }
}