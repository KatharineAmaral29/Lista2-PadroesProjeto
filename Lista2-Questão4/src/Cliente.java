
public class Cliente {
	public static void main(String [] args){
		ObserverGraficoPizza graficoPizza = new ObserverGraficoPizza();
		ObserverGraficoBarras graficoBarras = new ObserverGraficoBarras();
		ObserverTabela tabela = new ObserverTabela();

		Dados dados = new Dados(12,16,18);
		
		dados.registrar(graficoPizza);
		dados.registrar(graficoBarras);
		dados.registrar(tabela);
		
		dados.setValorA(20);
	}
}
