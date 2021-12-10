/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.fcompany.interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author agner
 */
public interface InterfaceProdutoDAO {
    
    public void salvarProdutoDAO(Object... valor);
    public void excluirProdutoDAO(int id);
    public void consultarProdutoDAO(Object... valor) throws SQLException;
    public void carregarProdutosDAO(JComboBox itens) throws SQLException;
    
    
}
