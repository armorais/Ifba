package interfaces;

public interface IAgregado {
	
	IIterator criarIterator(String atributo, String operador, String opcao);
	void add(IAgregavel item);
	
}
