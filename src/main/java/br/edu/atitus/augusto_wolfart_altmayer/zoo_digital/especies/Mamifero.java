package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Mamífero";
    }
}
