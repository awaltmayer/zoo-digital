package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Mamifero;

public class Baleia extends Mamifero implements Nadador {

    public Baleia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite um canto profundo e melodioso.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está filtrando krill pela barbatana.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente nos oceanos profundos.");
    }
}