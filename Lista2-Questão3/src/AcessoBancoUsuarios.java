import java.util.Scanner;

public class AcessoBancoUsuarios implements MostraUsuarios{
	String usuario = "admin";
	String senha = "admin";
	
	public void verificaAcesso(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira seu nome de usu�rio: ");
		String user = ler.nextLine();
		System.out.println("Insira sua senha: ");
		String password = ler.nextLine();
		
		if(user.equals(usuario) && senha.equals(password)){
			MostraUsuarios.display();
		}
		else{
			System.out.println("Usu�rio n�o possui acesso a essas informa��es");
		}
	}
}

