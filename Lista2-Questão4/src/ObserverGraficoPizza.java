import java.util.Observable;

import javax.swing.*;
import java.util.*;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

public class ObserverGraficoPizza extends JFrame implements Observer{
	public ObserverGraficoPizza(){
		super("Gráfico Pizza");
	}
	
	public void update(int valorA, int valorB, int valorC){	
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		
		pieDataset.setValue("A", valorA);
		pieDataset.setValue("B", valorB);
		pieDataset.setValue("C", valorC);
		
		JFreeChart grafico = ChartFactory.createPieChart("Gráfico de Pizza", pieDataset, true, true, false);
		
		this.add(new ChartPanel(grafico));
		
		this.pack();
		this.setVisible(true);
	}
}
