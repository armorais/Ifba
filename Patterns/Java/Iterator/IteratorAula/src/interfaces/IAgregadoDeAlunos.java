package interfaces;

import negocio.Aluno;

public interface IAgregadoDeAlunos {
	
	IIterator criarIterator(String atributo, String operador, String opcao);
	void add(Object aluno);
	
}
