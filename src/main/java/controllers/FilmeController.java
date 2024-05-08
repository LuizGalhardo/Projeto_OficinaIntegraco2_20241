package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Filme;
import models.Usuario;

public class FilmeController {

    public static Filme buscarItemPorId(String id) {
        Filme itemEncontrado = null;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM item WHERE id = ?")) {

            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Crie um novo objeto Filme com base nos dados do ResultSet
                itemEncontrado = new Filme();
                itemEncontrado.setId(resultSet.getInt("id"));
                itemEncontrado.setNome(resultSet.getString("nome"));
                itemEncontrado.setLocal(resultSet.getString("local"));
                itemEncontrado.setDescricao(resultSet.getString("descricao"));
                itemEncontrado.setDataEncontro(resultSet.getString("data_encontro"));
                itemEncontrado.setSituacao(resultSet.getString("situacao"));
                // Recupere o usuário criador pelo ID
                int criadoPorId = resultSet.getInt("criado_por");
                Usuario criadoPor = UsuarioController.buscarUsuarioPorId(Integer.toString(criadoPorId));

                itemEncontrado.setCriadoPor(criadoPor);
            } else {
                throw new RuntimeException("Item não encontrado!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return itemEncontrado;
    }

    public static List<Filme> listarItens() {
        List<Filme> itens = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM item");
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Filme item = new Filme();
                item.setId(resultSet.getInt("id"));
                item.setNome(resultSet.getString("nome"));
                item.setLocal(resultSet.getString("local"));
                item.setDescricao(resultSet.getString("descricao"));
                item.setDataEncontro(resultSet.getString("data_encontro"));
                item.setSituacao(resultSet.getString("situacao"));

                int criadoPorId = resultSet.getInt("criado_por");
                Usuario criadoPor = UsuarioController.buscarUsuarioPorId(Integer.toString(criadoPorId));

                item.setCriadoPor(criadoPor);
                itens.add(item);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return itens;
    }

    public static Boolean handleCadastro(Filme item) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo",
                    "root", "");

            PreparedStatement st = connection.prepareStatement(
                    "INSERT INTO item (nome, local, descricao, data_encontro, situacao, criado_por, atualizado_por) VALUES (?, ?, ?, ?, ?, ?, null)");

            st.setString(1, item.getNome());
            st.setString(2, item.getLocal());
            st.setString(3, item.getDescricao());
            st.setString(4, item.getDataEncontro());
            st.setString(5, item.getSituacao());
            st.setInt(6, item.getCriadoPor().getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }

    public static List<Filme> buscarItensPorNome(String nome) {
        List<Filme> itensEncontrados = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement(
                        "SELECT i.*, u.* FROM item i JOIN usuario u ON i.criado_por = u.id WHERE i.nome = ?")) {

            statement.setString(1, nome);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Filme item = new Filme();
                item.setId(resultSet.getInt("id"));
                item.setNome(resultSet.getString("nome"));
                item.setLocal(resultSet.getString("local"));
                item.setDescricao(resultSet.getString("descricao"));
                item.setDataEncontro(resultSet.getString("data_encontro"));
                item.setSituacao(resultSet.getString("situacao"));

                int criadoPorId = resultSet.getInt("criado_por");
                Usuario criadoPor = UsuarioController.buscarUsuarioPorId(Integer.toString(criadoPorId));

                item.setCriadoPor(criadoPor);

                itensEncontrados.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return itensEncontrados;
    }

    public static Boolean handleEdicao(Filme item) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_apoo", "root",
                "");
                PreparedStatement statement = connection.prepareStatement(
                        "UPDATE item SET nome = ?, local = ?, descricao = ?, data_encontro = ?, situacao = ?, atualizado_por = ? WHERE id = ?")) {

            statement.setString(1, item.getNome());
            statement.setString(2, item.getLocal());
            statement.setString(3, item.getDescricao());
            statement.setString(4, item.getDataEncontro());
            statement.setString(5, item.getSituacao());
            statement.setInt(6, item.getAlteradoPor().getId());
            statement.setInt(7, item.getId());

            int rowsUpdated = statement.executeUpdate();

            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
