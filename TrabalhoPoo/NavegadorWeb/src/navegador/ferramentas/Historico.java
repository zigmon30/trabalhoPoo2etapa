package navegador.ferramentas;

public class Historico {
	private String endereço_site;
	private String data;
	private String hora;

	public Historico() { // metodo construtor classe historico

	}

	public Historico(String endereço_site, String data, String hora) {
		this.endereço_site = endereço_site;
		this.data = data;
		this.hora = hora;
	}

	public Historico(String endereço_site) { // sobrecarga construtor
		this.endereço_site = endereço_site;

	}
	

	public String getEndereço_site() {
		return endereço_site;
	}

	public void setEndereço_site(String endereço_site) {
		this.endereço_site = endereço_site;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void inclui_historico(String endereco) {
		
		
	}

}
