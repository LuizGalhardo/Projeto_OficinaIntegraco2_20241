package View;

import Model.Item;
import javax.swing.JOptionPane;


public class GerenciarItem extends javax.swing.JFrame {
    
    private Item item = new Item();
    private static GerenciarItem gerItemUnico;
    
    
    // METODO ESTATICO PARA A CLASSE SER CHAMA EM OUTRA INTERFACE 
    //NAS OUTRAR DE EDICAO E CADASTRO A FUNCAO DESSE CODIGO É A MESMA
    
    public static GerenciarItem getGerItem(){
        if(gerItemUnico == null){
            gerItemUnico = new GerenciarItem();
        }
        return gerItemUnico;
    }

    
    public GerenciarItem() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblObj = new javax.swing.JLabel();
        txtObj = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        scrollDesc = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();
        btPostar = new javax.swing.JButton();

        jLabel1.setText("Objeto:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("CADASTRAR ITEM");

        lblObj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObj.setText("OBJETO:");

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

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("DATA DE ENCONTRO:");

        lblLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLocal.setText("LOCAL ENCONTRADO:");

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDesc.setText("DESCRIÇÃO DO OBJETO:");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        scrollDesc.setViewportView(txtDesc);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSair.setText("SAIR");
        btSair.setActionCommand("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btPostar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPostar.setText("POSTAR");
        btPostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPostarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblObj, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObj))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData)
                            .addComponent(txtLocal)))
                    .addComponent(scrollDesc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(btPostar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObj)
                    .addComponent(txtObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(410, Short.MAX_VALUE)
                    .addComponent(btPostar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btPostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPostarActionPerformed
        cadItem();
    }//GEN-LAST:event_btPostarActionPerformed

    
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
    private javax.swing.JButton btPostar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblObj;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollDesc;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtObj;
    // End of variables declaration//GEN-END:variables
}
