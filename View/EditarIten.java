
package View;

import Model.Item;
import javax.swing.JOptionPane;


public class EditarIten extends javax.swing.JFrame {

   private static EditarIten edItenUnico;
   private Item item = new Item();
   
   
    public EditarIten() {
        initComponents();
    }
    
    public static EditarIten getEdIten(){
        if(edItenUnico == null){
            edItenUnico = new EditarIten();
        }
        return edItenUnico;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btAtualizar = new javax.swing.JButton();
        txtObj = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        txtPesq = new javax.swing.JLabel();
        txtData1 = new javax.swing.JTextField();
        ckEncontrado = new javax.swing.JCheckBox();
        ckDevolvido = new javax.swing.JCheckBox();
        btPesq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OBJETO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DATA DE ENCONTRO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("LOCAL DE ENCONTRO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DESCRICÃO DO OBJETO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("EDITAR ITEM");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAtualizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btAtualizarMouseReleased(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        txtObj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtObjMouseEntered(evt);
            }
        });
        txtObj.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtObjInputMethodTextChanged(evt);
            }
        });
        txtObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObjActionPerformed(evt);
            }
        });

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSair.setText("SAIR");
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSairMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btSairMouseReleased(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        txtPesq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPesq.setText("OBJETO:");

        ckEncontrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckEncontrado.setText("ENCONTRADO");

        ckDevolvido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckDevolvido.setText("DEVOLVIDO");

        btPesq.setText("PESQUISAR");
        btPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObj))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckDevolvido)
                            .addComponent(jLabel4)
                            .addComponent(ckEncontrado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesq)
                        .addGap(18, 18, 18)
                        .addComponent(txtData1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesq)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btSair))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesq)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesq))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(ckDevolvido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckEncontrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarMouseClicked

    private void btAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarMouseEntered

    private void btAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarMouseExited

    private void btAtualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarMousePressed

    private void btAtualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarMouseReleased

    private void txtObjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObjMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObjMouseEntered

    private void txtObjInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtObjInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObjInputMethodTextChanged

    private void txtObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObjActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseClicked

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMousePressed

    private void btSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseReleased

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPesqActionPerformed

    public void cadItem() {

        item = new Item();

        item.setDesc(txtObj.getText());
        item.setDataCriacao(txtData.getText());
        item.setLocal(txtLocal.getText());
        item.setDescricao(txtDesc.getText());

        if (item != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "CADASTRADO COM SUCESSO!",
                    "CONFIRMAÇÃO DE CADASTRO",
                    3
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO DE CADASTRO",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
     public void limpar (){
        
        txtObj.setText("");
        txtData.setText("");
        txtLocal.setText("");
        txtDesc.setText("");
        
        txtObj.requestFocus();// retorna o foco para ct Objeto.
    
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
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btPesq;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox ckDevolvido;
    private javax.swing.JCheckBox ckEncontrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtData1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtObj;
    private javax.swing.JLabel txtPesq;
    // End of variables declaration//GEN-END:variables
}
