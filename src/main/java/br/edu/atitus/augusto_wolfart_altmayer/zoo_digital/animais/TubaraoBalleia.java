package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Peixe;

public class TubaraoBalleia extends Peixe implements Nadador {

    public TubaraoBalleia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite vibrações sônicas de baixa frequência.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está filtrando plâncton e pequenos peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente.");
    }
}

//coloquei o tubarão Baleia com dois "ll" para facilitar posteriormente o sistema de pesquisas.