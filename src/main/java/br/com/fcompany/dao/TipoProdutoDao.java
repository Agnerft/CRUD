/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.dao;

import br.com.fcompany.interfaces.InterfaceProdutoDAO;
import br.com.fcompany.ws.TipoProdutoModelo;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author agner
 */
public class TipoProdutoDao implements InterfaceProdutoDAO{

    
        
    @Override
    public void salvarProdutoDAO(Object... valor) {
        TipoProdutoModelo tpm = (TipoProdutoModelo) valor[0];
        
        tpm.getNome();
        
        System.out.println("ESTOU NO DAO NO BANCO " + tpm.getNome());
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
