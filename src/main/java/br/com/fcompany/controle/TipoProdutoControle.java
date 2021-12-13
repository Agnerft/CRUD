package br.com.fcompany.controle;

import br.com.fcompany.dao.TipoProdutoDao;
import br.com.fcompany.interfaces.InterfaceControle;
import br.com.fcompany.rn.TipoProdutoModelo;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoProdutoControle implements InterfaceControle {

    TipoProdutoModelo tpm = new TipoProdutoModelo();
    TipoProdutoDao tpd = new TipoProdutoDao();

    @Override
    public void salvarProduto(Object... valor) {

        if ("".equals(valor[0])) {
            tpm.setId(1);
        } else {
            tpm.setId((int) valor[0]);
        }

        tpm.setNome((String) valor[1]);

        tpm.setCaracteristicaProduto((String) valor[2]);

        tpm.setContagemProduto(Integer.valueOf((String) valor[3]));

        tpm.setValorCompra(Double.valueOf((String) valor[4]));

        // ENVIAR PARA O DAO
        tpd.salvarProdutoDAO(tpm);

    }

    @Override
    public void excluirProduto() {

    }

    public List<TipoProdutoModelo> carregarProdutos(String nome) {
        List lista = new LinkedList();
        try {
            lista = tpd.carregarProdutosDAO(nome);
            System.out.println("Teste2");
        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

//    @Override
//    public void consultarControle(Object... valor) {
//       
//        try {
//            tpd.consultarProdutoDAO(valor);
//        } catch (SQLException ex) {
//            Logger.getLogger(TipoProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
}
