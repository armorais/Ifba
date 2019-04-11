package negocio;

import java.util.ArrayList;

import interfaces.IAgregadoDeAlunos;
import interfaces.IIterator;

public class ListaDeAlunos implements IAgregadoDeAlunos {

	ArrayList<Object> alunos = new ArrayList<Object>();
	
	public void add(Object object) {
		alunos.add(object);
	}
	
	@Override
	public IIterator criarIterator(String atributo, String operador , String opcao) {
		return new AlunosIterator(alunos,atributo, operador, opcao);
	}

}
