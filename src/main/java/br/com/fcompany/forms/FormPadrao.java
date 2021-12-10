
package br.com.fcompany.forms;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author agner
 */
abstract public class FormPadrao extends javax.swing.JInternalFrame {
        
           
    JLabel jlConsulta;
    JTextField jtfConsulta;
        // METODOS QUE SERÃO IMPLEMENTADOS NAS CLASSES FILHAS
    abstract public void inicializarComponentes();
    abstract public void salvar();
        
        // CONSTRUTOR -- SERA EXECUTADO QUANDO O FORM FOR CHAMADO
    
    public FormPadrao() {
        initComponents();
        habilitaBotoes(true);
        jTextFieldBoxId.setEditable(false);
        limpaCampos();
        desabilitaEdicao();
        

        //jLabel - consulta
        jlConsulta = new JLabel("Consulta");
        jlConsulta.setBounds(5, 5, 50, 25);
        
        jPanelConsulta.add(jlConsulta);
        
    
        //jTextField - consulta
        
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(60, 5, 533, 25);
        
         jPanelConsulta.add(jtfConsulta);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnBotoes = new javax.swing.JPanel();
        jBNovoProduto = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPnFormulario = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldBoxNome = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldBoxValor = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jTextFieldBoxQuantidade = new javax.swing.JTextField();
        jTextFieldCaractProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBoxCaractProduto = new javax.swing.JTextArea();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldBoxId = new javax.swing.JTextField();
        jPanelConsulta = new javax.swing.JPanel();
        jBFechar = new javax.swing.JButton();

        jPnBotoes.setBackground(new java.awt.Color(204, 204, 255));

        jBNovoProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\novo.png")); // NOI18N
        jBNovoProduto.setMnemonic('N');
        jBNovoProduto.setText("Novo");
        jBNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoProdutoActionPerformed(evt);
            }
        });

        jBAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\edit.png")); // NOI18N
        jBAlterar.setMnemonic('A');
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\remove.png")); // NOI18N
        jBExcluir.setMnemonic('E');
        jBExcluir.setText("Excluir");

        jBSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\salvar.png")); // NOI18N
        jBSalvar.setMnemonic('S');
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\cancel.png")); // NOI18N
        jBCancelar.setMnemonic('C');
        jBCancelar.setText("Cancelar");
        jBCancelar.setToolTipText("");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnBotoesLayout = new javax.swing.GroupLayout(jPnBotoes);
        jPnBotoes.setLayout(jPnBotoesLayout);
        jPnBotoesLayout.setHorizontalGroup(
            jPnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnBotoesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jBNovoProduto)
                .addGap(37, 37, 37)
                .addComponent(jBAlterar)
                .addGap(37, 37, 37)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(31, 31, 31)
                .addComponent(jBCancelar)
                .addGap(60, 60, 60))
        );
        jPnBotoesLayout.setVerticalGroup(
            jPnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovoProduto)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBCancelar)
                    .addComponent(jBSalvar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPnFormulario.setBackground(new java.awt.Color(204, 255, 255));

        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setText("NOME");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValor.setText("VALOR");
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jTextFieldBoxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBoxValorActionPerformed(evt);
            }
        });

        jTextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQuantidade.setText("QUANTIDADE");
        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jTextFieldCaractProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCaractProduto.setText("CARACTERISTICAS DO PRODUTO");
        jTextFieldCaractProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaractProdutoActionPerformed(evt);
            }
        });

        jTextAreaBoxCaractProduto.setColumns(20);
        jTextAreaBoxCaractProduto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBoxCaractProduto);

        jTextFieldId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldId.setText("ID");
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextFieldBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBoxIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnFormularioLayout.createSequentialGroup()
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnFormularioLayout.createSequentialGroup()
                                .addComponent(jTextFieldBoxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldCaractProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBoxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCaractProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConsulta.setBackground(new java.awt.Color(204, 204, 255));

        jBFechar.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\Fechar.png")); // NOI18N
        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFechar)
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoProdutoActionPerformed
       habilitaBotoes(false);
       limpaCampos();
       jTextFieldBoxNome.requestFocus();
    }//GEN-LAST:event_jBNovoProdutoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        habilitaBotoes(true);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed
    
    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        habilitaBotoes(false);
        jTextFieldBoxNome.requestFocus();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        habilitaBotoes(true);
        salvar();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
    desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
   desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldBoxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBoxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBoxValorActionPerformed

    private void jTextFieldCaractProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaractProdutoActionPerformed
       desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldCaractProdutoActionPerformed

    private void jTextFieldBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBoxIdActionPerformed
       
    }//GEN-LAST:event_jTextFieldBoxIdActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
      desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
       desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed
            //METODO PARA HABILITAR E DESABILITAR OS BOTÕES NO FORMULARIO
    public void habilitaBotoes(boolean estado){
        jBNovoProduto.setEnabled(estado);
        jBExcluir.setEnabled(estado);
        jBAlterar.setEnabled(estado);
        
        jBSalvar.setEnabled(!estado);
        jBCancelar.setEnabled(!estado);
    }
    
    public void desabilitaEdicao(){
        jTextFieldNome.setEditable(false);
        jTextFieldId.setEditable(false);
        jTextFieldQuantidade.setEditable(false);
        jTextFieldCaractProduto.setEditable(false);
        jTextFieldValor.setEditable(false);
        
    }
    
    // METODO PARA LIMPAR OS CAMPOS
    public void limpaCampos(){
        jTextFieldBoxNome.setText("");
        jTextFieldBoxQuantidade.setText("");
        jTextFieldBoxValor.setText("");
        jTextAreaBoxCaractProduto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBNovoProduto;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPnBotoes;
    private javax.swing.JPanel jPnFormulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBoxCaractProduto;
    private javax.swing.JTextField jTextFieldBoxId;
    private javax.swing.JTextField jTextFieldBoxNome;
    private javax.swing.JTextField jTextFieldBoxQuantidade;
    private javax.swing.JTextField jTextFieldBoxValor;
    private javax.swing.JTextField jTextFieldCaractProduto;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
