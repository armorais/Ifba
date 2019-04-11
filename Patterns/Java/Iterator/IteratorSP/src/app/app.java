package app;

import interfaces.IAgregado;
import interfaces.IAgregavel;
import interfaces.IIterator;
import negocio.agregados.LinkedListDeItens;
import negocio.itens.Aluno;
import negocio.itens.Cachorro;

public class app {
	
	public static void main(String[] args) throws Exception {
	
		IAgregavel a = new Aluno("Jonas","M","A1",5.8);
		IAgregavel b = new Aluno("Paula","F","A2",4);
		IAgregavel c = new Aluno("Pedro","M","B1",5.6);
		IAgregavel d = new Aluno("Fernanda","F","A1",8);
		IAgregavel e = new Aluno("João","M","B1",3);
		IAgregavel f = new Cachorro("Nino","M");
		
//		IAgregado lista = new ArrayListDeItens();
		IAgregado lista = new LinkedListDeItens();		
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		
		IIterator it = lista.criarIterator("media",">","5");
		
		IAgregavel item = null;
		
		while(it.hasNext()) 	
			if((item = it.next())!=null)
				System.out.println(item.nome());
		
	}
}
