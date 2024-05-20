package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Usuario;

public class LoginController {

    public static Usuario handleLogin(String email, String senha) {
        Usuario usuarioLogado = null;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:4306/oficina2",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("SELECT id, email, nome, senha FROM usuario WHERE email=? AND senha=?");

            st.setString(1, email);
            st.setString(2, senha);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                usuarioLogado = new Usuario();
                usuarioLogado.setId(rs.getInt("id"));
                usuarioLogado.setNome(rs.getString("nome"));
                usuarioLogado.setSenha(rs.getString("senha"));
                usuarioLogado.setEmail(rs.getString("email"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return usuarioLogado;
    }

}
