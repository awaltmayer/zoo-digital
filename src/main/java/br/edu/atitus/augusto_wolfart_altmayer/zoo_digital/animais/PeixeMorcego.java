package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Peixe;

public class PeixeMorcego extends Peixe implements Nadador {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite sons de baixa frequência para comunicação.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos crustáceos e vermes do fundo.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está 'caminhando' no fundo do mar com suas nadadeiras.");
    }
}