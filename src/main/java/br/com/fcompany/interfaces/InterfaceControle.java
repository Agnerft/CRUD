/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.fcompany.interfaces;

import br.com.fcompany.rn.TipoProdutoModelo;
import java.util.List;

/**
 *
 * @author agner
 */
public interface InterfaceControle {
    
    public void salvarProduto(Object... valor);
    public void excluirProduto();
    public List<TipoProdutoModelo> carregarProdutos(String nome);
   // public void consultarControle(Object... valor);
    
    
}
