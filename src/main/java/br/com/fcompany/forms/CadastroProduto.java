package br.com.fcompany.forms;


import br.com.fcompany.controle.TipoProdutoControle;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroProduto extends FormPadrao {
    
    
    // INSTANCIA DO CONTROLE
    TipoProdutoControle tpc = new TipoProdutoControle();
    
    
    JLabel jlCaracteristica;
    JTextArea jtCaracteristica;
       
    JLabel jlContagemProduto;
    JTextField jtContagemProduto;
     
    JLabel jlValor;
    JTextField jtValor;
    
  
    public CadastroProduto() {

        setTitle("CADASTRO DE PRODUTO");
        
    }

    @Override
    public void inicializarComponentes() {

        //fiz uma alteração
        // TextField CARACTERISTICA
        jlCaracteristica = new JLabel("CARACTERISTICA");
        jlCaracteristica.setBounds(95, 73, 125, 20);
        jlCaracteristica.setBackground(Color.white);
        jlCaracteristica.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        jlCaracteristica.setOpaque(true);
        // ADD NO FORMULARIO
        jPnFormulario.add(jlCaracteristica);
        // TextArea CARACTERISICA
        jtCaracteristica = new JTextArea();        
        jtCaracteristica.setBounds(239, 73, 351, 50);        
        jtCaracteristica.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        // ADD NO FORMULARIO
        jPnFormulario.add(jtCaracteristica);
        
        // TextField CONTAGEM PRODUTO
        jlContagemProduto = new JLabel("QTD. PRODUTO");
        jlContagemProduto.setBounds(120, 137, 100, 20);
        jlContagemProduto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        jlContagemProduto.setBackground(Color.white);
        jlContagemProduto.setOpaque(true);
        // ADD NO FORMULARIO
        jPnFormulario.add(jlContagemProduto);
        // JTextField CONTAGEM PRODUTO
        jtContagemProduto = new JTextField();
        jtContagemProduto.setBounds(239, 137, 28, 20);
        jtContagemProduto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        // ADD NO FORMULARIO
        jPnFormulario.add(jtContagemProduto);
        
        // JLabel VALOR
        jlValor = new JLabel("VALOR");
        jlValor.setBounds(445, 137, 50, 20);
        jlValor.setBackground(Color.white);
        jlValor.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        jlValor.setOpaque(true);
        // ADD NO FORMULARIO
        jPnFormulario.add(jlValor);
        
        // JTextField VALOR
        jtValor = new JTextField();
        jtValor.setBounds(515, 137, 75, 20);
        jtValor.setBackground(Color.white);
        jtValor.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        jtValor.setOpaque(true);
        
        jPnFormulario.add(jtValor);
             
    }

    @Override
    public void salvar(){
        // INSERIR OS COMANDOS QUE SERÁ FEITO NO CONTROLE
        tpc.salvarProduto(jTextFieldBoxId.getText(), jTextFieldBoxNome.getText());
    }

}
