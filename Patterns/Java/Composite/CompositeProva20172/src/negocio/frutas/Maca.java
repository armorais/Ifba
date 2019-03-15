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
public class Maca extends Componente implements IClonavel  {

    public Maca() {
        super("Maçã");
    }
    
    @Override
    public void realizarLimpeza() {
        System.out.println("limpando uma maçã");
    }

    @Override
    public Componente clone() {
        return (Componente)new Maca();
    }
    
}
