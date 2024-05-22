
package views;

import controllers.UsuarioController;
import models.Usuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.SessionManager;

public class EdicaoUsuario extends javax.swing.JFrame {

    private static EdicaoUsuario cadUsuarioUnico;

    public EdicaoUsuario() {
        initComponents();
        setTitle("Cine UTFPR - Minha Conta");
        var usuarioLogado = SessionManager.getUsuarioLogado();
        Usuario usuario = UsuarioController.buscarUsuarioPorId(usuarioLogado.getId());
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
    }

    public static EdicaoUsuario getEditaUsuario() {
        if (cadUsuarioUnico == null) {
            cadUsuarioUnico = new EdicaoUsuario();
        }
        return cadUsuarioUnico;
    }
    
    public static EdicaoUsuario get() {
        EdicaoUsuario instance = getEditaUsuario();
        var usuarioLogado = SessionManager.getUsuarioLogado();
        Usuario usuario = UsuarioController.buscarUsuarioPorId(usuarioLogado.getId());
        instance.txtNome.setText(usuario.getNome());
        instance.txtEmail.setText(usuario.getEmail());
        return instance;
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        lblId1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId1.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setText("EDITAR DADOS");

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
        lblConfSenha.setText("CONFIRMAR SENHA ");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConfirmaSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfSenha)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 284, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btGravarActionPerformed

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        char[] senhaChars = txtSenha.getPassword();
        String senha = new String(senhaChars);
        char[] confirmaSenhaChars = txtConfirmaSenha.getPassword();
        String confirmaSenha = new String(confirmaSenhaChars);

        if (nome.length() == 0 || email.length() == 0
                || senha.length() == 0 || confirmaSenha.length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro de edição",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!UsuarioController.validateEmail(email)) {
            JOptionPane.showMessageDialog(null, "Informe um e-mail válido!", "Erro de edição",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!", "Erro de edição",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuario = buildUsuario();

        try {
            Boolean userEdited = UsuarioController.handleEdicao(usuario);
            if (userEdited) {
                clearTextFields();
                dispose();
                JOptionPane.showMessageDialog(new JFrame(), "Dados atualizados com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de edição", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btGravarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed        
        try {
            Usuario usuario = UsuarioController.buscarUsuarioPorId(SessionManager.getUsuarioLogado().getId());

            txtNome.setText(usuario.getNome());
            txtEmail.setText(usuario.getEmail());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de edição", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Você tem certeza que deseja sair?",
                "Cancelar operação",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    public Usuario buildUsuario() {
        Usuario usuario = new Usuario();
        usuario.setId(Integer.valueOf(SessionManager.getUsuarioLogado().getId().toString()));
        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
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
    private javax.swing.JButton btGravar;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
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
