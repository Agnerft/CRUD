/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.dao;

import br.com.fcompany.interfaces.InterfaceProdutoDAO;
import br.com.fcompany.ws.TipoProdutoModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author agner
 */
public class TipoProdutoDao implements InterfaceProdutoDAO{
    
    private PreparedStatement pdst;
    private ResultSet rs;
    ConexaoBanco con = new ConexaoBanco();
    
    @Override
    public void salvarProdutoDAO(Object... valor) {
        try {
            con.openConnection();
             
            TipoProdutoModelo tpm = (TipoProdutoModelo) valor[0];
            String salvarProduto = "INSERT INTO cadastro_produto (nome) VALUES (?) RETURNING id";
            
            pdst = con.getCon().prepareStatement(salvarProduto);
                pdst.setObject(1, tpm.getNome());
                    pdst.execute();
                    pdst.close();
                    
        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoDao.class.getName()).log(Level.SEVERE, null,"ERRO" + ex);
            
        }
    }

    @Override
    public void excluirProdutoDAO(int id) {
        
    }

    @Override
    public void consultarProdutoDAO(Object... valor) throws SQLException {
        
    }

    @Override
    public void carregarProdutosDAO(JComboBox itens) throws SQLException {
        
    }
    
}
