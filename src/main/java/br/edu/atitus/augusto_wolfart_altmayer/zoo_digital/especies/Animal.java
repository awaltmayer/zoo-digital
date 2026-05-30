package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies;

public abstract class Animal {

    private static int contador = 0;

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public final void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento + ".");
    }

    public abstract String getEspecie();

    @Override
    public String toString() {
        return String.format("Nome: %-15s | Idade: %2d ano(s) | Espécie: %s", nome, idade, getEspecie());
    }
}