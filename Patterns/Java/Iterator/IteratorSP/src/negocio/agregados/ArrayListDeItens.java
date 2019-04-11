package negocio.agregados;

import java.util.ArrayList;

import interfaces.IAgregado;
import interfaces.IAgregavel;
import interfaces.IIterator;
import negocio.iterators.SuperListIterator;

public class ArrayListDeItens implements IAgregado {

	ArrayList<IAgregavel> alunos = new ArrayList<IAgregavel>();
	
	public void add(IAgregavel item) {
		alunos.add(item);
	}
	
	@Override
	public IIterator criarIterator(String atributo, String operador , String opcao) {
		return new SuperListIterator(alunos,atributo, operador, opcao);
	}

}
