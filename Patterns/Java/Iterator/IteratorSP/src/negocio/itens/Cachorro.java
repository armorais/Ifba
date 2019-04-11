package negocio.itens;

import interfaces.IAgregavel;

public class Cachorro implements IAgregavel {
	private String nome;
	private String sexo;
	
	public Cachorro(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	@Override
	public String nome() {
		return nome;
	}
	
	public String sexo() {
		return sexo;
	}

}
