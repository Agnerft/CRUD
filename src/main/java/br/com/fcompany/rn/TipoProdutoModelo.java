/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.rn;

/**
 *
 * @author agner
 */
public class TipoProdutoModelo {
    
    private int id;
    private String nome;
//  private int codigoEstoque;
    private String caracteristicaProduto;
    private int contagemProduto;
    private double valorCompra;
//  private double porcentagem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

//    public int getCodigoEstoque() {
//        return codigoEstoque;
//    }
//
//    public void setCodigoEstoque(int codigoEstoque) {
//        this.codigoEstoque = codigoEstoque;
//    }

    public String getCaracteristicaProduto() {
        return caracteristicaProduto;
    }

    public void setCaracteristicaProduto(String caracteristicaProduto) {
        this.caracteristicaProduto = caracteristicaProduto;
    }

    public int getContagemProduto() {
        return contagemProduto;
    }

    public void setContagemProduto(int contagemProduto) {
        this.contagemProduto = contagemProduto;
    }

//    public double getPorcentagem() {
//        return porcentagem;
//    }
//
//    public void setPorcentagem(double porcentagem) {
//        this.porcentagem = porcentagem;
//    }

    public String toString() {
        return (" Id = " + id + " Nome = " + nome + " Caracteristica do Produto = " + caracteristicaProduto + " Contagem de Produtos = "
                + contagemProduto + " Valor da Compra = " + valorCompra);
    }
  
    
}
