package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Predador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.Voador;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Ave;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite um grito agudo e imponente.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo a presa.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " mergulha a 200km/h para pegar a presa.");
    }
    @Override
    public String getTipo() {
        return "Águia";
    }
}