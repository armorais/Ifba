/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author alison
 */
public abstract class Componente {
    
    protected ArrayList<Componente> componentes = new ArrayList<>();
    private final String descricao;
    
    public abstract void realizarLimpeza();
       
    public void add(Componente componente) {
        System.out.println("Não é possivel inserir em uma folha!");
    }
    
    public Componente(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
    
}
