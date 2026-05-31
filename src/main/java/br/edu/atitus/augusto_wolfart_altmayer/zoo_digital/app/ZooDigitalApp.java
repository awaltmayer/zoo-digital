package br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.app;

import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.animais.*;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.comportamentos.*;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.database.AnimalDAO;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.database.ConexaoBanco;
import br.edu.atitus.augusto_wolfart_altmayer.zoo_digital.especies.Animal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static AnimalDAO dao;

    public static void main(String[] args) {
        try {
            dao = new AnimalDAO(ConexaoBanco.getConexao());
            List<Animal> salvos = dao.carregarTodos();
            animais.addAll(salvos);
            if (!salvos.isEmpty()) {
                System.out.println("[Banco] " + salvos.size() + " animal(is) carregado(s) do banco de dados.");
            }
        } catch (SQLException e) {
            System.err.println("[Banco] Erro ao conectar: " + e.getMessage());
            System.err.println("[Banco] O sistema funcionara sem persistencia.");
        }

        limparTela();
        System.out.println("============================================");
        System.out.println("       Bem-vindo ao Zoo Digital!            ");
        System.out.println("============================================");

        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opcao: ");
            limparTela();

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 8 -> removerAnimal();
                case 0 -> System.out.println("Encerrando o Zoo Digital. Ate logo!");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
                limparTela();
            }

        } while (opcao != 0);

        ConexaoBanco.fechar();
        scanner.close();
    }

    private static void limparTela() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }

    private static void exibirMenu() {
        System.out.println("============================================");
        System.out.println("           Zoo Digital                      ");
        System.out.println("============================================");
        System.out.println("  1 - Cadastrar Animal");
        System.out.println("  2 - Listar Todos os Animais");
        System.out.println("  3 - Listar Animais Corredores");
        System.out.println("  4 - Listar Animais Nadadores");
        System.out.println("  5 - Listar Animais Voadores");
        System.out.println("  6 - Listar Animais Predadores");
        System.out.println("  7 - Exibir Total de Animais Cadastrados");
        System.out.println("  8 - Remover Animal");
        System.out.println("  0 - Sair");
        System.out.println("============================================");
    }

    private static void cadastrarAnimal() {
        System.out.println("=== Cadastrar Animal ===");
        System.out.println("Tipos disponiveis:");
        System.out.println("  Mamiferos : 1-Cachorro  2-Gato  3-Golfinho  4-Baleia  5-Lobo");
        System.out.println("  Aves      : 6-Pato  7-Pinguim  8-Aguia  9-Flamingo");
        System.out.println("  Peixes    : 10-PeixeMorcego  11-Traira  12-Piranha  13-TubaraoBaleia");
        System.out.println("  Repteis   : 14-CobraCoral  15-Jabuti  16-JacareAcu  17-Lagartixa");

        int tipo = lerInteiro("Tipo: ");
        if (tipo < 1 || tipo > 17) {
            System.out.println("Tipo invalido.");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Nome nao pode ser vazio.");
            return;
        }

        int idade = lerInteiro("Idade (anos): ");
        if (idade < 0) {
            System.out.println("Idade invalida.");
            return;
        }

        Animal animal = switch (tipo) {
            case 1  -> new Cachorro(nome, idade);
            case 2  -> new Gato(nome, idade);
            case 3  -> new Golfinho(nome, idade);
            case 4  -> new Baleia(nome, idade);
            case 5  -> new Lobo(nome, idade);
            case 6  -> new Pato(nome, idade);
            case 7  -> new Pinguim(nome, idade);
            case 8  -> new Aguia(nome, idade);
            case 9  -> new Flamingo(nome, idade);
            case 10 -> new PeixeMorcego(nome, idade);
            case 11 -> new Traira(nome, idade);
            case 12 -> new Piranha(nome, idade);
            case 13 -> new TubaraoBaleia(nome, idade);
            case 14 -> new CobraCoral(nome, idade);
            case 15 -> new Jabuti(nome, idade);
            case 16 -> new JacareAcu(nome, idade);
            case 17 -> new Lagartixa(nome, idade);
            default -> throw new IllegalArgumentException("Tipo invalido");
        };

        animais.add(animal);

        try {
            if (dao != null) dao.salvar(animal);
        } catch (SQLException e) {
            System.err.println("[Banco] Erro ao salvar: " + e.getMessage());
        }

        System.out.println("\n" + nome + " cadastrado(a) com sucesso!");
    }

    private static void listarTodos() {
        System.out.println("=== Todos os Animais ===\n");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom();
            a.comer();
            System.out.println();
        }
    }

    private static void listarCorredores() {
        System.out.println("=== Animais Corredores ===\n");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Corredor corredor) {
                System.out.println(a);
                corredor.correr();
                System.out.println();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    private static void listarNadadores() {
        System.out.println("=== Animais Nadadores ===\n");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Nadador nadador) {
                System.out.println(a);
                nadador.nadar();
                System.out.println();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    private static void listarVoadores() {
        System.out.println("=== Animais Voadores ===\n");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Voador voador) {
                System.out.println(a);
                voador.voar();
                System.out.println();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal voador cadastrado.");
    }

    private static void listarPredadores() {
        System.out.println("=== Animais Predadores ===\n");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Predador predador) {
                System.out.println(a);
                predador.cacar();
                System.out.println();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal predador cadastrado.");
    }

    private static void exibirTotal() {
        System.out.println("=== Total de Animais ===\n");
        System.out.println("Total de animais cadastrados: " + Animal.getContador());
    }

    private static void removerAnimal() {
        System.out.println("=== Remover Animal ===\n");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        System.out.print("Nome do animal a remover: ");
        String nome = scanner.nextLine().trim();

        boolean removido = animais.removeIf(a -> a.getNome().equalsIgnoreCase(nome));

        if (removido) {
            try {
                if (dao != null) dao.remover(nome);
            } catch (SQLException e) {
                System.err.println("[Banco] Erro ao remover: " + e.getMessage());
            }
            System.out.println(nome + " removido(a) com sucesso.");
        } else {
            System.out.println("Animal nao encontrado.");
        }
    }

    private static int lerInteiro(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Por favor, informe um numero inteiro.");
            }
        }
    }
}