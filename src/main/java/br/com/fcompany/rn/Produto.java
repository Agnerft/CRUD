/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.rn;

/**
 *
 * @author agner
 */
public class Produto{

    private Integer id;
    private String nomeProduto;
    private double valorCompra;
    private int codigoEstoque;
    private String caracteristicaProduto;
    private int contagemProduto;
    private double porcentagem;

    public Produto() {

    }

    public Produto(String nomeProduto, double valorCompra, String caracteristicaProduto, int contagemProduto, double porcentagem) {
        this.caracteristicaProduto = caracteristicaProduto;
        this.nomeProduto = nomeProduto;
        this.valorCompra = valorCompra;
        this.contagemProduto = contagemProduto;
        this.porcentagem = porcentagem;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getCaracteristicaProduto() {
        return caracteristicaProduto;
    }

    public void setCaracteristicaProduto(String caracteristicaProduto) {
        this.caracteristicaProduto = caracteristicaProduto;
    }

    public int getCodigoEstoque() {
        return codigoEstoque;
    }

    public int getContagemProduto() {
        return contagemProduto;
    }

    public void setContagemProduto(int contagemProduto) {
        this.contagemProduto = contagemProduto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCodigoEstoque(int codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
    }

    public double valorVenda() {

        double valorVenda = (this.valorCompra * porcentagem) + this.valorCompra;

        return valorVenda;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return "{ Produto = " + nomeProduto + ", Valor da compra = " + valorCompra + ", Codigo do Estoque = " + codigoEstoque + ", Caracteristica do produto = " + caracteristicaProduto + ", Contagem do Produto = " + contagemProduto + '}';
    }

//    @Override
//    public int compareTo(Produto utroProduto) {
//        return this.nomeProduto.compareTo(utroProduto.nomeProduto);
//
//    }

}
