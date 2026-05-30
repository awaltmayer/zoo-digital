package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

    private static final String URL = "jdbc:sqlite:zoo-digital.db";
    private static Connection instancia;

    // Singleton: uma única conexão durante toda a execução
    public static Connection getConexao() throws SQLException {
        if (instancia == null || instancia.isClosed()) {
            instancia = DriverManager.getConnection(URL);
            criarTabela(instancia);
        }
        return instancia;
    }

    public static void fechar() {
        if (instancia != null) {
            try {
                instancia.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

    private static void criarTabela(Connection conexao) throws SQLException {
        String sql = """
                CREATE TABLE IF NOT EXISTS animais (
                    id    INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome  TEXT    NOT NULL,
                    idade INTEGER NOT NULL,
                    tipo  TEXT    NOT NULL
                )
                """;
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
        }
    }
}
