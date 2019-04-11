package negocio;

import java.lang.reflect.Method;
import java.util.ArrayList;

import interfaces.IIterator;

public class AlunosIterator implements IIterator {
	
	private ArrayList<Object> objetos = new ArrayList<Object>();
	private String atributo;
	private Character operador;
	private String opcao;
	private int posicao = 0;
	private Method metodo = null;
	
	public AlunosIterator(ArrayList<Object> objetos, String atributo, String operador, String opcao) {
		this.objetos = objetos;
		this.opcao = opcao;
		this.operador = operador.charAt(0);
		this.atributo = atributo;
	}

	public Object next() throws Exception {
		Object objeto = null;
		do {
			if(itemValido()) {
				objeto = objetos.get(posicao);
				posicao++;
				return objeto;
			}
			else
				posicao++;
		} while (hasNext());
		return objeto;
	}

    public boolean hasNext() {
        if (posicao >= objetos.size() || objetos.get(posicao) == null) {
            return false;
        } else {
            return true;
        }
    }
    
    private void setMethod() {
    	Class classe = objetos.get(posicao).getClass();
    	try {
			metodo = classe.getMethod(atributo);
		} catch (Exception e) {
		}
    }
    
    private boolean itemValido() throws Exception {
    	setMethod();
    	switch(operador) {
    	case '=':
    		return metodo.invoke(objetos.get(posicao)).equals(opcao);
    	case '<':
    		return (double)metodo.invoke(objetos.get(posicao)) < Double.parseDouble(opcao);
    	case '>':	
    		return (double)metodo.invoke(objetos.get(posicao)) > Double.parseDouble(opcao);  
    	default:
    		return false;
    	}
    }
    	
}
