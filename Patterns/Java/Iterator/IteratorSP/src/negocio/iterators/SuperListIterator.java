package negocio.iterators;

import java.lang.reflect.Method;
import java.util.List;

import interfaces.IAgregavel;
import interfaces.IIterator;

public class SuperListIterator implements IIterator {
	
	private List<IAgregavel> itens;
	private String atributo;
	private Character operador;
	private String opcao;
	private int posicao = 0;
	private Method metodo = null;
	
	public SuperListIterator(List<IAgregavel> itens, String atributo, String operador, String opcao) {
		this.itens = itens;
		this.opcao = opcao;
		this.operador = operador.charAt(0);
		this.atributo = atributo;
	}

	public IAgregavel next() throws Exception {
		IAgregavel item = null;
		do {
			if(itemValido()) {
				item = itens.get(posicao);
				posicao++;
				return item;
			}
			else
				posicao++;
		} while (hasNext());
		return item;
	}

    public boolean hasNext() {
        if (posicao >= itens.size() || itens.get(posicao) == null) {
            return false;
        } else {
            return true;
        }
    }
    
    private boolean setMethod() {
    	Class<? extends IAgregavel> classe = itens.get(posicao).getClass();
    	try {
			metodo = classe.getMethod(atributo);
		} catch (Exception e) {
			return false;
		}
    	return true;
    }
    
    private boolean itemValido() throws Exception {
    	if (!setMethod())
    		return false;
    	
    	switch(operador) {
    	case '=':
    		return metodo.invoke(itens.get(posicao)).equals(opcao);
    	case '<':
    		return (double)metodo.invoke(itens.get(posicao)) < Double.parseDouble(opcao);
    	case '>':	
    		return (double)metodo.invoke(itens.get(posicao)) > Double.parseDouble(opcao);  
    	default:
    		return false;
    	}
    }
    	
}
