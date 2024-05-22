package controllers;

import enums.TipoUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import models.Compra;
import models.Filme;

import models.Usuario;

public class CompraController {

    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean handleCadastro(Compra compra) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/oficina2",
                    "root", "");

            PreparedStatement st = connection.prepareStatement(
                    "INSERT INTO compra (quantidade, filme_id, usuario_id) VALUES (?, ?, ?)");

            st.setString(1, compra.getQuantidade());
            st.setInt(2, compra.getFilme().getId());
            st.setInt(3, compra.getUsuario().getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }

    public static List<Compra> listarComprasPorUsuario(int usuarioId) {
        List<Compra> compras = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/oficina2",
                "root", "")) {
            PreparedStatement st = connection.prepareStatement(
                    "SELECT * FROM compra WHERE usuario_id = ?");
            st.setInt(1, usuarioId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int compraId = rs.getInt("id");
                String quantidade = rs.getString("quantidade");
                int filmeId = rs.getInt("filme_id");
                Usuario usuario = UsuarioController.buscarUsuarioPorId(usuarioId);
                Filme filme = FilmeController.buscarPorId(filmeId);
                Compra compra = new Compra();
                compra.setQuantidade(quantidade);
                compra.setUsuario(usuario);
                compra.setFilme(filme);
                compras.add(compra);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return compras;
    }

    public static List<Compra> buscarComprasPorNomeFilme(String nomeFilme) {
        List<Compra> compras = new ArrayList<>();

        String query = "SELECT compra.*, filme.id AS filme_id, filme.titulo, filme.data_lancamento, filme.elenco, filme.sinopse, "
                + "usuario.id AS usuario_id, usuario.nome, usuario.email "
                + "FROM compra "
                + "JOIN filme ON compra.filme_id = filme.id "
                + "JOIN usuario ON compra.usuario_id = usuario.id "
                + "WHERE filme.titulo = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/oficina2",
                "root", ""); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nomeFilme);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int compraId = resultSet.getInt("id");
                String quantidade = resultSet.getString("quantidade");
                int filmeId = resultSet.getInt("filme_id");
                String titulo = resultSet.getString("titulo");
                String dataLancamento = resultSet.getString("data_lancamento");
                String elenco = resultSet.getString("elenco");
                String sinopse = resultSet.getString("sinopse");
                int usuarioId = resultSet.getInt("usuario_id");
                String nomeUsuario = resultSet.getString("nome");
                String emailUsuario = resultSet.getString("email");

                Usuario usuario = UsuarioController.buscarUsuarioPorId(usuarioId);
                Filme filme = FilmeController.buscarPorId(filmeId);
                Compra compra = new Compra();
                compra.setQuantidade(quantidade);
                compra.setUsuario(usuario);
                compra.setFilme(filme);

                compras.add(compra);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return compras;
    }
}
