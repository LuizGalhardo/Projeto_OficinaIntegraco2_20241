
package views;

import controllers.FilmeController;
import models.Filme;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Feed extends javax.swing.JFrame {

    private static Feed feedUnico;

    public static Feed getFeed() {
        if (feedUnico == null) {
            feedUnico = new Feed();
        }
        return feedUnico;
    }

    public Feed() {
        initComponents();
        setTitle("Conecta UTFPR - Feed");

        DefaultTableModel modelo = (DefaultTableModel) tableFeed.getModel();
        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            boolean isEmpty = true;

            for (int j = 0; j < modelo.getColumnCount(); j++) {
                Object value = modelo.getValueAt(i, j);
                if (value != null && !value.toString().isEmpty()) {
                    isEmpty = false;
                    break;
                }
            }

            if (isEmpty) {
                modelo.removeRow(i);
            }
        }

        List<Filme> itens = FilmeController.listarItens();
        Collections.sort(itens, Comparator.comparingInt(Filme::getId).reversed());

        for (Filme item : itens) {
            /* Object[] rowData = { item.getNome(), item.getLocal(), item.getSituacao(), item.getCriadoPor().getNome() };
            modelo.addRow(rowData); */
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableFeed = new javax.swing.JTable();
        lblPesq = new javax.swing.JLabel();
        botaoPesquisa = new javax.swing.JButton();
        txtPesquisa = new java.awt.TextField();
        lblTitulo = new javax.swing.JLabel();
        butComprar = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        gerItem = new javax.swing.JMenu();
        CadItem = new javax.swing.JMenuItem();
        EditItem = new javax.swing.JMenuItem();
        gerUsuario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableFeed.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tableFeed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TÍTULO", "DATA DE ESTREIA", "ELENCO", "SINOPSE"
            }
        ));
        jScrollPane1.setViewportView(tableFeed);
        if (tableFeed.getColumnModel().getColumnCount() > 0) {
            tableFeed.getColumnModel().getColumn(0).setResizable(false);
            tableFeed.getColumnModel().getColumn(1).setResizable(false);
            tableFeed.getColumnModel().getColumn(2).setResizable(false);
            tableFeed.getColumnModel().getColumn(3).setResizable(false);
        }

        lblPesq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesq.setText("PESQUISAR FILME");

        botaoPesquisa.setLabel("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("FILMES EM CARTAZ");

        butComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butComprar.setText("COMPRAR FILME");

        gerItem.setText("FILME");

        CadItem.setText("CADASTRO");
        CadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadItemActionPerformed(evt);
            }
        });
        gerItem.add(CadItem);

        EditItem.setText("EDITAR");
        EditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditItemActionPerformed(evt);
            }
        });
        gerItem.add(EditItem);

        menuPrincipal.add(gerItem);

        gerUsuario.setText("CONTA");

        jMenuItem1.setText("EDITAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        gerUsuario.add(jMenuItem1);

        menuPrincipal.add(gerUsuario);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesq)
                            .addComponent(butComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(44, 44, 44)
                .addComponent(lblPesq)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(butComprar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPesquisaActionPerformed

    private void EditItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EditItemActionPerformed
        abreEdicaoItem();
    }// GEN-LAST:event_EditItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        abreEditaUsuario();
    }// GEN-LAST:event_jMenuItem1ActionPerformed

    private void CadItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CadItemActionPerformed
        abreGerItem();
    }// GEN-LAST:event_CadItemActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoPesquisaActionPerformed
        String nome = txtPesquisa.getText();
        List<Filme> itens = FilmeController.buscarItensPorNome(nome);

        DefaultTableModel modelo = (DefaultTableModel) tableFeed.getModel();
        modelo.setRowCount(0);
        if (nome.isEmpty()) {
            itens = FilmeController.listarItens();
        }
        for (Filme item : itens) {
            /* Object[] rowData = { item.getNome(), item.getLocal(), item.getSituacao(), item.getCriadoPor().getNome() };
            modelo.addRow(rowData); */
        }
    }// GEN-LAST:event_botaoPesquisaActionPerformed

    public void abreGerItem() {
        CadastroFilme.getGerItem().setVisible(true);
    }

    public void abreEdicaoItem() {
        // EdicaoFilme.getEdicaoItem().setVisible(true);
    }

    public void abreEditaUsuario() {
        EdicaoUsuario.getEditaUsuario().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadItem;
    private javax.swing.JMenuItem EditItem;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton butComprar;
    private javax.swing.JMenu gerItem;
    private javax.swing.JMenu gerUsuario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesq;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JTable tableFeed;
    private java.awt.TextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
