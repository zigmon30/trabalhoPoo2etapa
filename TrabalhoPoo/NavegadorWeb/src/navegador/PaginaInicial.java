package navegador;

import java.util.Date;

public class PaginaInicial {
	private String EnderecoPagina;
	private Date data;

	public PaginaInicial() { // metodo padrão construtor classe site

	}

	public PaginaInicial(String enderecoPagina) {
		
		EnderecoPagina = enderecoPagina;
	}

	public PaginaInicial(String enderecoPagina, Date data) {
		
		EnderecoPagina = enderecoPagina;
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEnderecoPagina() {
		return EnderecoPagina;
	}

	public void setEnderecoPagina(String enderecoPagina) {
		EnderecoPagina = enderecoPagina;
	}

}
