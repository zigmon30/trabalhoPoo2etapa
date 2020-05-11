package navegador.ferramentas;

public class Favoritos {
	private String nome;
	private String endereco;

	public Favoritos() {

	}

	public Favoritos(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public Favoritos(String endereco) {  //sobrecargas

		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
