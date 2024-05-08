
package View;

import javax.swing.JOptionPane;


public class Feed extends javax.swing.JFrame {
    
    private static Feed feedUnico;

    
     public static Feed getFeed(){
        if(feedUnico == null){
            feedUnico = new Feed();
        }
        return feedUnico;
    }
    
    public Feed() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableFeed = new javax.swing.JTable();
        lblPesq = new javax.swing.JLabel();
        butPesq = new javax.swing.JButton();
        txtPesq = new java.awt.TextField();
        lblTitulo = new javax.swing.JLabel();
        butSair = new javax.swing.JButton();
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
                "Nome", "Local", "Situação", "Encontrado por"
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
        lblPesq.setText("PESQUISA POR NOME:");

        butPesq.setLabel("Pesquisar");

        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("FEED - PRODUTOS ENCONTRADOS");

        butSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        gerItem.setText("GERENCIAR ITEM ");

        CadItem.setText("CADASTRAR ITEM");
        CadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadItemActionPerformed(evt);
            }
        });
        gerItem.add(CadItem);

        EditItem.setText("EDITAR ITEM ");
        EditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditItemActionPerformed(evt);
            }
        });
        gerItem.add(EditItem);

        menuPrincipal.add(gerItem);

        gerUsuario.setText("USUÁRIO");

        jMenuItem1.setText("ALTERAR USUÁRIO");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butPesq)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butSair))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPesq)
                                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(butSair))
                .addGap(129, 129, 129)
                .addComponent(lblPesq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPesq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqActionPerformed

    private void EditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditItemActionPerformed
        abreEdItem();
    }//GEN-LAST:event_EditItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        abreEditaUsuario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadItemActionPerformed
        abreGerItem();
    }//GEN-LAST:event_CadItemActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
       sair();
    }//GEN-LAST:event_butSairActionPerformed

    
     public void abreGerItem(){
        GerenciarItem.getGerItem().setVisible(true);
    }
     
     public void abreEdItem(){
         EditarIten.getEdIten().setVisible(true);
     }
     
     public void abreEditaUsuario(){
         EditaUsuario.getEditaUsuario().setVisible(true);
     }
     
     public void sair(){
        int respSair = JOptionPane.showConfirmDialog(
                    null,
                    "DESEJA REALMENTE SAIR?",
                    "SAIR",
                    JOptionPane.YES_NO_OPTION
            );
        
        if(respSair == 0){
            dispose();
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadItem;
    private javax.swing.JMenuItem EditItem;
    private javax.swing.JButton butPesq;
    private javax.swing.JButton butSair;
    private javax.swing.JMenu gerItem;
    private javax.swing.JMenu gerUsuario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesq;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JTable tableFeed;
    private java.awt.TextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
