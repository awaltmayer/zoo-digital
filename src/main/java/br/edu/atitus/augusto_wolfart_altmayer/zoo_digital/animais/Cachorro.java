package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Mamifero;

public class Cachorro extends Mamifero implements Corredor, Predador {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Au au!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás do carteiro.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando a meia que roubou.");
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }
}
