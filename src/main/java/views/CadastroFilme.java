package views;

import models.Filme;
import models.SessionManager;
import controllers.FilmeController;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CadastroFilme extends javax.swing.JFrame {

    private Filme item = new Filme();
    private static CadastroFilme gerItemUnico;

    public static CadastroFilme getGerItem() {
        if (gerItemUnico == null) {
            gerItemUnico = new CadastroFilme();
        }
        return gerItemUnico;
    }

    public CadastroFilme() {
        initComponents();
        setTitle("Conecta UTFPR - Cadastro de Item");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblObj = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        scrollDesc = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jLabel1.setText("Objeto:");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblObj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObj.setText("TÍTULO");

        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeMouseEntered(evt);
            }
        });
        txtNome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNomeInputMethodTextChanged(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("ELENCO");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lblLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLocal.setText("DATA DE ESTREIA");

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDesc.setText("SINOPSE");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        scrollDesc.setViewportView(txtDescricao);

        btSair.setText("Cancelar");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setText("CADASTRO FILME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtLocal)
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(lblLocal)
                            .addComponent(lblObj, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addComponent(scrollDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addGap(372, 372, 372)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(btSair))
                .addGap(27, 27, 27)
                .addComponent(lblObj)
                .addGap(8, 8, 8)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(512, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtNomeMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeMouseEntered

    private void txtNomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_txtNomeInputMethodTextChanged
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeInputMethodTextChanged

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtLocalActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
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
    }// GEN-LAST:event_btSairActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = txtNome.getText();
        String local = txtLocal.getText();
        String data = txtData.getText();
        String descricao = txtDescricao.getText();

        if (nome.length() == 0 || local.length() == 0 || data.length() == 0 || descricao.length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro de cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Filme item = buildItem();

        try {
            Boolean itemCreated = FilmeController.handleCadastro(item);
            if (itemCreated) {
                clearTextFields();
                dispose();
                JOptionPane.showMessageDialog(new JFrame(), "Item criado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_botaoSalvarActionPerformed

    public Filme buildItem() {
        Filme item = new Filme();
        item.setNome(txtNome.getText());
        item.setLocal(txtLocal.getText());
        item.setDataEncontro(txtData.getText());
        item.setDescricao(txtDescricao.getText());
        item.setSituacao("Encontrado");
        item.setCriadoPor(SessionManager.getUsuarioLogado());

        return item;
    }

    public void clearTextFields() {
        txtNome.setText("");
        txtLocal.setText("");
        txtData.setText("");
        txtDescricao.setText("");
    }

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblObj;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollDesc;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
