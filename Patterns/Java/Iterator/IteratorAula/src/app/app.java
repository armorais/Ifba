package app;

import java.lang.reflect.Method;

import interfaces.IAgregadoDeAlunos;
import interfaces.IIterator;
import negocio.Aluno;
import negocio.Cachorro;
import negocio.ListaDeAlunos;

public class app {
	
	public static void main(String[] args) {
	
		Aluno a = new Aluno("Jonas","M","A1",5.8);
		Aluno b = new Aluno("Paula","F","A2",4);
		Aluno c = new Aluno("Pedro","M","B1",5.6);
		Aluno d = new Aluno("Fernanda","F","A1",8);
		Aluno e = new Aluno("João","M","B1",3);
		Cachorro f = new Cachorro("Nino","M");
		
		IAgregadoDeAlunos lista = new ListaDeAlunos();
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		
		IIterator it = lista.criarIterator("media",">","5");
		boolean i = it.hasNext();
		
		while(it.hasNext()) {		
			Object object = null;
			try {
				object = it.next();
				Class classe = object.getClass();
				Method m = classe.getMethod("nome");
				if(object!=null)
					System.out.println(m.invoke(object));
			} catch (Exception e1) {
				break;
			}
			
		}
	}
}
