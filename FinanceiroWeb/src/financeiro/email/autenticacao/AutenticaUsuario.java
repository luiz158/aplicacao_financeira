package financeiro.email.autenticacao;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class AutenticaUsuario extends Authenticator {

	private String usuario;
	private String senha;
	
	public AutenticaUsuario(String usuario,String senha){
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public PasswordAuthentication getPassWordAuthentication(){
		return new PasswordAuthentication(this.usuario, this.senha);
	}
}
