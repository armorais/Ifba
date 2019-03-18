/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.frutas;

import interfaces.Componente;
import interfaces.IClonavel;

/**
 *
 * @author alison
 */
public class Laranja extends Componente implements IClonavel {
    
    public Laranja() {
        super("Laranja");
    }
    
    @Override
    public void realizarLimpeza() {
        System.out.println("Limpando uma laranja");
    }

    @Override
    public Componente clonar() {
        return (Componente)new Laranja();
    }
       
}
