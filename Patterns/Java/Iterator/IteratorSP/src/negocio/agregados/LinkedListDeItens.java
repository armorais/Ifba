package negocio.agregados;

import java.util.LinkedList;

import interfaces.IAgregado;
import interfaces.IAgregavel;
import interfaces.IIterator;
import negocio.iterators.SuperListIterator;

public class LinkedListDeItens implements IAgregado {

	LinkedList<IAgregavel> alunos = new LinkedList<IAgregavel>();
	
	public void add(IAgregavel item) {
		alunos.add(item);
	}
	
	@Override
	public IIterator criarIterator(String atributo, String operador , String opcao) {
		return new SuperListIterator(alunos,atributo, operador, opcao);
	}

}
