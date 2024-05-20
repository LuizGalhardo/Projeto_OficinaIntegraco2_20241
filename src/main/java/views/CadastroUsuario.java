
package views;

import controllers.UsuarioController;
import enums.TipoUsuario;
import models.Usuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CadastroUsuario extends javax.swing.JFrame {

    private static CadastroUsuario cadUsuarioUnico;

    public CadastroUsuario() {
        initComponents();
        setTitle("Conecta UTFPR - Cadastro de Usuário");
    }

    public static CadastroUsuario getCadUsuario() {
        if (cadUsuarioUnico == null) {
            cadUsuarioUnico = new CadastroUsuario();
        }
        return cadUsuarioUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btGravar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmaSenha = new javax.swing.JPasswordField();
        botaoCancelar = new javax.swing.JButton();

        lblId1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId1.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setText("CADASTRO USUÁRIO");

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setText("NOME");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("E - MAIL");

        btGravar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btGravar.setText("SALVAR");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("SENHA");

        lblConfSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConfSenha.setText("CONFIRMAR SENHA");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSenha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfSenha)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 287, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtConfirmaSenha)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(botaoCancelar))
                .addGap(30, 30, 30)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btGravarActionPerformed

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String tipoUsuario = "Cliente";
        char[] senhaChars = txtSenha.getPassword();
        String senha = new String(senhaChars);
        char[] confirmaSenhaChars = txtConfirmaSenha.getPassword();
        String confirmaSenha = new String(confirmaSenhaChars);

        if (nome.length() == 0 || email.length() == 0 || tipoUsuario.length() == 0
                || senha.length() == 0 || confirmaSenha.length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro de cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!UsuarioController.validateEmail(email)) {
            JOptionPane.showMessageDialog(null, "Informe um e-mail válido!", "Erro de cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!", "Erro de cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuario = buildUsuario();

        try {
            Boolean userCreated = UsuarioController.handleCadastro(usuario);
            if (userCreated) {
                clearTextFields();
                dispose();
                JOptionPane.showMessageDialog(new JFrame(), "Usuário criado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btGravarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoCancelarActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Você tem certeza que deseja sair?",
                "Cancelar operação",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            clearTextFields();
            dispose();
        }
    }// GEN-LAST:event_botaoCancelarActionPerformed

    public Usuario buildUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setTipoUsuario(TipoUsuario.CLIENTE);
        usuario.setSenha(new String(txtSenha.getPassword()));

        return usuario;
    }

    public void clearTextFields() {
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        txtConfirmaSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton btGravar;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtConfirmaSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
