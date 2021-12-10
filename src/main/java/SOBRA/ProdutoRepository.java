/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOBRA;

import br.com.fcompany.rn.Produto;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agner
 */
public class ProdutoRepository {

    private Connection con;
    private PreparedStatement pdst;
    private ResultSet rs;

    public void openConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cliente", "postgres", "postgres");
    }

    public void insereProduto(Produto produto) throws SQLException {
        openConnection();
        try {
            String insereProduto = "INSERT INTO produto (nomeProduto, valorCompra,valorVenda, caracteristicaProduto, contagemProduto) VALUES (?,?,?,?,?)"
                    + "RETURNING id, codigoEstoque";

            pdst = con.prepareStatement(insereProduto);

            pdst.setObject(1, produto.getNomeProduto());
            pdst.setObject(2, produto.getValorCompra());
            pdst.setObject(3, produto.valorVenda());
            pdst.setObject(4, produto.getCaracteristicaProduto());
            pdst.setObject(5, produto.getContagemProduto());

            rs = pdst.executeQuery();
        } finally {
            closeConnection();
        }
    }

    public Produto selectProduto(int idproduto, Produto produto) throws SQLException {
        openConnection();
        try {
            String selectProduto = "SELECT * FROM produto where id = ?";
            pdst = con.prepareStatement(selectProduto);
            pdst.setObject(1, idproduto);

            rs = pdst.executeQuery();
            if (rs.next()) {
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setValorCompra(rs.getDouble("valorCompra"));
                produto.setCaracteristicaProduto(rs.getString("caracteristicaProduto"));
                produto.setContagemProduto(rs.getInt("contagemProduto"));
                produto.setCodigoEstoque(rs.getInt("codigoEstoque"));
                produto.setId(idproduto);
            }

        } finally {
            closeConnection();
        }
        return produto;
    }

    public void deleteProduto(int idproduto) throws SQLException {
        openConnection();
        try {
            String deleteProduto = "DELETE FROM produto where id = ?";
            pdst = con.prepareStatement(deleteProduto);
            pdst.setInt(1, idproduto);
            pdst.execute();

        } finally {
            closeConnection();
        }
    }

    public int updateProduto(int idproduto, Produto produto) throws SQLException{
        openConnection();
        try{ 
            String updateProduto = "UPDATE produto set nomeProduto=?, valorCompra=?, caracteristicaProduto=?, contagemProduto=? where id = ?";
            pdst = con.prepareStatement(updateProduto);
            
            pdst.setInt(5, idproduto);
            pdst.setString(1, produto.getNomeProduto());
            pdst.setDouble(2, produto.getValorCompra());
            pdst.setString(3, produto.getCaracteristicaProduto());
            pdst.setInt(4, produto.getContagemProduto());
            pdst.execute();
            
        }finally{
            closeConnection();
        }
        return 0;
    }
    
    public int atualizarEstoque(int idproduto, int novoValor) throws SQLException{
        openConnection();
        
        try{  
         String updateEstoque = "UPDATE produto set contagemProduto = (contagemProduto + ?) where id = ?";
        pdst = con.prepareStatement(updateEstoque);
        pdst.setObject(2, idproduto);
       
        pdst.setInt(1, novoValor);
        
        pdst.execute();
  
        }finally{
            closeConnection();
        }
        return 0;
    }
    
    public String listaProdutos() throws SQLException {

          ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
          openConnection();
           int soma = 0;
          try {
               
                String listarProdutos = "select * from produto";
                pdst = con.prepareStatement(listarProdutos);
                rs = pdst.executeQuery();
                
                
                while (rs.next()) {
                   Produto produto = new Produto();
                    produto.setNomeProduto(rs.getString("nomeProduto"));
                    produto.setValorCompra(rs.getDouble("valorCompra"));
                    produto.setCaracteristicaProduto(rs.getString("caracteristicaProduto"));
                    produto.setContagemProduto(rs.getInt("contagemProduto"));
                    produto.setCodigoEstoque(rs.getInt("codigoEstoque"));
                    soma++;
                    System.out.println(produto);
                    
                }   
          }finally{
              System.out.println(soma);
              closeConnection();
          }
        return "";
          
         
    }
    
    
    
    public void closeConnection() throws SQLException {
        con.close();
    }

}
