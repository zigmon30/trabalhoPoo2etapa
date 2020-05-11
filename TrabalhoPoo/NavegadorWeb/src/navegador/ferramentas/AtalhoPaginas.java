package navegador.ferramentas;

public class AtalhoPaginas {
	private String nome;
	private String endereco_site;

	public AtalhoPaginas() {

	}

	public AtalhoPaginas(String nome, String endereco_site) {

		this.nome = nome;
		this.endereco_site = endereco_site;
	}

	public AtalhoPaginas(String endereco_site) { // sobrecarga de metodo

		this.endereco_site = endereco_site;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco_site() {
		return endereco_site;
	}

	public void setEndereco_site(String endereco_site) {
		this.endereco_site = endereco_site;
	}

}
