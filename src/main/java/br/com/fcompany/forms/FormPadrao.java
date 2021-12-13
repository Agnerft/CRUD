
package br.com.fcompany.forms;

import br.com.fcompany.rn.TipoProdutoModelo;
import br.com.fcompany.util.Tabela;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    abstract public void criarTabela();
    abstract public void carregarTabela();
    private TipoProdutoModelo tproduto;
  
    
    // CRIANDO A TABELA
    
    
    JTable tabela;
    DefaultTableModel modelo = new DefaultTableModel();
    
    // Instanciando objeto para manipular a classe tabela
    
    
  
    
    Tabela utilTabela = new Tabela();
        // CONSTRUTOR -- SERA EXECUTADO QUANDO O FORM FOR CHAMADO
        //Metodo Construtor
    public FormPadrao() {
        initComponents();
        habilitaBotoes(true);
        jtFieldBoxId.setEditable(false);
        limpaCampos();
        desabilitaEdicao();
        inicializarComponentes();
        criarTabela();
        
        

        //jLabel - consulta
        jlConsulta = new JLabel("CONSULTA");
        jlConsulta.setBackground(Color.white);
        jlConsulta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        jlConsulta.setBounds(15, 10, 90, 20);
        jlConsulta.setOpaque(true);
        jPanelConsulta.add(jlConsulta);
        
    
        //jTextField - consulta
        
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(120, 10, 533, 20);
        jtfConsulta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
         jPanelConsulta.add(jtfConsulta);  
         carregarTabela();
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
        jtBoxNome = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jtFieldBoxId = new javax.swing.JTextField();
        jBFechar = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();

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
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jtBoxNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBoxNomeActionPerformed(evt);
            }
        });

        jTextFieldId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldId.setText("ID");
        jTextFieldId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jtFieldBoxId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtFieldBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFieldBoxIdActionPerformed(evt);
            }
        });

        jBFechar.setIcon(new javax.swing.ImageIcon("C:\\Users\\agner\\Documents\\NetBeansProjects\\FictitiousCompany\\src\\main\\java\\br\\com\\fcompany\\imagens\\Fechar.png")); // NOI18N
        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jtBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFechar))
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jtFieldBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFieldBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelConsulta.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
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
       jtBoxNome.requestFocus();
    }//GEN-LAST:event_jBNovoProdutoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        habilitaBotoes(true);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed
    
    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        habilitaBotoes(false);
        jtBoxNome.requestFocus();
        carregarTabela();
        
        
        
        
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        habilitaBotoes(true);
        salvar();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
    desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jtFieldBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFieldBoxIdActionPerformed
       
    }//GEN-LAST:event_jtFieldBoxIdActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
      desabilitaEdicao();
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jtBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBoxNomeActionPerformed
        
    }//GEN-LAST:event_jtBoxNomeActionPerformed
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
       
        
    }
    
    // METODO PARA LIMPAR OS CAMPOS
    public void limpaCampos(){
        jtBoxNome.setText("");
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    public javax.swing.JButton jBNovoProduto;
    public javax.swing.JButton jBSalvar;
    public javax.swing.JPanel jPanelConsulta;
    public javax.swing.JPanel jPnBotoes;
    public javax.swing.JPanel jPnFormulario;
    public javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    public javax.swing.JTextField jtBoxNome;
    public javax.swing.JTextField jtFieldBoxId;
    // End of variables declaration//GEN-END:variables
}
