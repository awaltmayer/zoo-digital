package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies;

public abstract class Ave extends Animal {

    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Ave";
    }
}
