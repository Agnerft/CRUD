/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.fcompany.interfaces;

import br.com.fcompany.rn.TipoProdutoModelo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author agner
 */
public interface InterfaceProdutoDAO {
    
    public void salvarProdutoDAO(Object... valor);
    public void excluirProdutoDAO();
    public void consultarProdutoDAO(Object... valor) throws SQLException;
    public List<TipoProdutoModelo> carregarProdutosDAO(String nome) throws SQLException;
    
    
}
