package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.database;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais.*;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    private final Connection conexao;

    public AnimalDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvar(Animal animal) throws SQLException {
        String sql = "INSERT INTO animais (nome, idade, tipo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, animal.getNome());
            stmt.setInt(2, animal.getIdade());
            stmt.setString(3, animal.getClass().getSimpleName());
            stmt.executeUpdate();
        }
    }

    public List<Animal> carregarTodos() throws SQLException {
        List<Animal> lista = new ArrayList<>();
        String sql = "SELECT nome, idade, tipo FROM animais";

        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int idade   = rs.getInt("idade");
                String tipo = rs.getString("tipo");

                Animal animal = instanciar(tipo, nome, idade);
                if (animal != null) {
                    lista.add(animal);
                }
            }
        }
        return lista;
    }

    public boolean remover(String nome) throws SQLException {
        String sql = "DELETE FROM animais WHERE nome = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            return stmt.executeUpdate() > 0;
        }
    }

    private Animal instanciar(String tipo, String nome, int idade) {
        return switch (tipo) {
            case "Cachorro"       -> new Cachorro(nome, idade);
            case "Gato"           -> new Gato(nome, idade);
            case "Golfinho"       -> new Golfinho(nome, idade);
            case "Baleia"         -> new Baleia(nome, idade);
            case "Lobo"           -> new Lobo(nome, idade);
            case "Pato"           -> new Pato(nome, idade);
            case "Pinguim"        -> new Pinguim(nome, idade);
            case "Aguia"          -> new Aguia(nome, idade);
            case "Flamingo"       -> new Flamingo(nome, idade);
            case "PeixeMorcego"   -> new PeixeMorcego(nome, idade);
            case "Traira"         -> new Traira(nome, idade);
            case "Piranha"        -> new Piranha(nome, idade);
            case "TubaraoBaleia" -> new TubaraoBaleia(nome, idade);
            case "CobraCoral"     -> new CobraCoral(nome, idade);
            case "Jabuti"         -> new Jabuti(nome, idade);
            case "JacareAcu"      -> new JacareAcu(nome, idade);
            case "Lagartixa"      -> new Lagartixa(nome, idade);
            default -> null;
        };
    }
}
