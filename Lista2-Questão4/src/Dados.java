import java.util.ArrayList;

public class Dados implements IDados{
	int valorA, valorB, valorC;
	ArrayList<Observer> listaObservadores = new ArrayList<Observer>();
	
	public Dados(int a, int b, int c){
		valorA = a;
		valorB = b;
		valorC = c;
	}

	public int getValorA() {
		return valorA;
	}

	public void setValorA(int valorA) {
		this.valorA = valorA;
		notificarObservadores();
	}

	public int getValorB() {
		return valorB;
	}

	public void setValorB(int valorB) {
		this.valorB = valorB;
		notificarObservadores();
	}

	public int getValorC() {
		return valorC;
	}

	public void setValorC(int valorC) {
		this.valorC = valorC;
		notificarObservadores();
	}

	@Override
	public void registrar(Observer o) {
		listaObservadores.add(o);
	}

	@Override
	public void desregistrar(Observer o) {
		listaObservadores.remove(o);		
	}

	@Override
	public void notificarObservadores() {
		for(int i=0;i<listaObservadores.size();i++){
			listaObservadores.get(i).update(valorA,valorB,valorC);
		}	
	}
	
	
}
