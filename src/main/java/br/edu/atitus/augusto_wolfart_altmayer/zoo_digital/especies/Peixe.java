package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies;

public abstract class Peixe extends Animal {

    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Peixe";
    }
}