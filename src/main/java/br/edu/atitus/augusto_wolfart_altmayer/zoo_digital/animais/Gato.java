package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Mamifero;

public class Gato extends Mamifero implements Corredor, Predador {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Mia!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás do passarinho. ");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um rato.");
    }
    @Override
    public String getTipo() {
        return "Gato";
    }
}