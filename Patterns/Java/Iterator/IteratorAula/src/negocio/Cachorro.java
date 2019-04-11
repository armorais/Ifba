package negocio;

public class Cachorro {
	private String nome;
	private String sexo;
	
	public Cachorro(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public String nome() {
		return nome;
	}
	
	public String sexo() {
		return sexo;
	}

}
