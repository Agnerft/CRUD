
package br.com.fcompany.controle;

import br.com.fcompany.dao.TipoProdutoDao;
import br.com.fcompany.interfaces.InterfaceControle;
import br.com.fcompany.ws.TipoProdutoModelo;


public class TipoProdutoControle implements InterfaceControle{
    
    TipoProdutoModelo tpm = new TipoProdutoModelo();
    TipoProdutoDao tpd = new TipoProdutoDao();
    
    @Override
    public void salvarProduto(Object... valor) {
    
        if("".equals(valor[0])){
         tpm.setId(1);
        }else{
        tpm.setId( ( int ) valor[0]);}
        
        tpm.setNome( (String) valor[1]);
        
//        tpm.setCaracteristicaProduto( (String) valor[2]);
//        if("".equals(valor[2])){
//            tpm.setContagemProduto(0);
//        }else{
//        tpm.setContagemProduto( (int) valor[3]);
//        }
//        if("".equals(valor[4])){
//            tpm.setValorCompra(0.0);
//        }else{
//        tpm.setValorCompra( (double) valor[4]);
//        }
//      
      // ENVIAR PARA O DAO
      
        tpd.salvarProdutoDAO(tpm);
      
    }

    @Override
    public void excluirProduto(int id) {
        
    }

    @Override
    public void carregarProdutos() {
      
    }
    
}
