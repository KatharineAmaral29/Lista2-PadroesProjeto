
public interface MostraUsuarios {
	public static void display(){
		BancoUsuarios bu = new BancoUsuarios();
		System.out.println(bu.getNumeroDeUsuarios());
		System.out.println(bu.getUsuariosConectados());
	}
}
