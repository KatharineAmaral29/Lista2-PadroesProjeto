import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ObserverGraficoBarras extends JFrame implements Observer{

	public void update(int valorA, int valorB, int valorC) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		  int total = valorA+valorB+valorC;
		  System.out.println((valorA*100)/total);
		  dataset.setValue((valorA*100)/total, "A","");
		  dataset.setValue((valorB*100)/total, "B","");
		  dataset.setValue((valorC*100)/total, "C","");

		  JFreeChart grafico = ChartFactory.createBarChart3D("Grafico de Barras", "","Porcentagem", dataset,PlotOrientation.VERTICAL, true,true,false);
		  CategoryPlot plot = (CategoryPlot) grafico.getPlot();
		  CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
		  xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); // Inclinamos 45 grados las etiquetas del eje X
		  plot.setBackgroundAlpha(0.5f);
		  
		  ChartPanel chartPanel = new ChartPanel(grafico);
		  chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		  setContentPane(chartPanel);

		  this.pack();
		  this.setVisible(true);
	}

}
