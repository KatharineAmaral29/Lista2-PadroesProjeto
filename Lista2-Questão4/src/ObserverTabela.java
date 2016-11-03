import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ObserverTabela extends JFrame implements Observer{

	public void update(int valorA, int valorB, int valorC) {
		JPanel painelFundo;
	    JTable tabela;
	    JScrollPane barraRolagem;
	       
	    Object [][] dados = {
	        {"A", valorA},
	        {"B", valorB},
	        {"C", valorC}
	    };
	    
	    String [] colunas = {"Tipo", "Valor"}; 
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
        
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
	    
	}

}
