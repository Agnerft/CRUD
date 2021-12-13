/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.dao;

import br.com.fcompany.interfaces.InterfaceProdutoDAO;
import br.com.fcompany.rn.Produto;
import br.com.fcompany.rn.TipoProdutoModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            String salvarProduto = "INSERT INTO cadastro_produto (nome, caracteristicaProduto, contagemProduto, valorCompra) VALUES (?,?,?,?) RETURNING id";
            
            pdst = con.getCon().prepareStatement(salvarProduto);
                pdst.setObject(1, tpm.getNome());
                pdst.setObject(2, tpm.getCaracteristicaProduto());
                pdst.setObject(3, tpm.getContagemProduto());
                pdst.setObject(4, tpm.getValorCompra());
                    pdst.execute();
                    pdst.close();
                    
        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoDao.class.getName()).log(Level.SEVERE, null,"ERRO" + ex);
            
        }
    }

    @Override
    public void excluirProdutoDAO() {
        
    }

    @Override
    public void consultarProdutoDAO(Object... valor) throws SQLException {
        String carregarProdutos = "select * from cadastro_produto";
        pdst = con.getCon().prepareStatement(carregarProdutos);
        rs = pdst.executeQuery();
        
        
    }

    @Override
    public List<TipoProdutoModelo> carregarProdutosDAO(String nome) throws SQLException {
   
     con.openConnection();
  
        List<TipoProdutoModelo> lista = new LinkedList<>();
        
        String carregarLista = "select * from cadastro_produto";
        pdst = con.getCon().prepareStatement(carregarLista);
        rs = pdst.executeQuery();
        while(rs.next()){
           TipoProdutoModelo p = new TipoProdutoModelo();
           p.setId(rs.getInt("id"));
           p.setNome(rs.getString("nome"));
           p.setCaracteristicaProduto(rs.getString("caracteristicaProduto"));
           p.setContagemProduto(rs.getInt("contagemProduto"));
           p.setValorCompra(rs.getDouble("valorCompra"));
           lista.add(p);                      
        }
        
       return lista;
        
    }
    
}
