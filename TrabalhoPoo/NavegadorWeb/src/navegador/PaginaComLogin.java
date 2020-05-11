// classe filha de classe PaginaInicial com atributo adicional de Login
// ou seja quando usuario loga no navegador, pagina com login, herda tudo 
// da classe PaginaInicial

package navegador;

import java.util.Date;

public class PaginaComLogin extends PaginaInicial {

	private String login;
	private int senha;

	public PaginaComLogin() {

	}
	
	

	public PaginaComLogin(String enderecoPagina, Date data, String login) {
		super(enderecoPagina, data);
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
