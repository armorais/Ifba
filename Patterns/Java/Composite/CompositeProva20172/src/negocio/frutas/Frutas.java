/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.frutas;

import interfaces.Componente;

/**
 *
 * @author alison
 */
public class Frutas extends Componente {
    
    public Frutas(String descricao) {
        super(descricao);
    }
    
    @Override
    public void realizarLimpeza(){
        System.out.println("Percorrendo: " + this.toString());
        for(Componente aux : componentes )
            aux.realizarLimpeza();
        
    }
    
    @Override
    public void add(Componente componente){
        componentes.add(componente);
    } 
    
    @Override
    public void clear(){
        for(Componente aux : componentes )
            aux.clear();
        
        componentes.clear();
    }
    
}
