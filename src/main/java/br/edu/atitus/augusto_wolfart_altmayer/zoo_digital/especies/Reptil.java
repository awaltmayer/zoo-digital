package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies;

public abstract class Reptil extends Animal {

    public Reptil(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Réptil";
    }
}