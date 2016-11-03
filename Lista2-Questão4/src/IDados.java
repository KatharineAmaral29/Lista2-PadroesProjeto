
public interface IDados {
	void registrar(Observer o);
	void desregistrar(Observer o);
	void notificarObservadores();
}
