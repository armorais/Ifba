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
public class Caju extends Componente implements IClonavel {
    
    public Caju() {
        super("Caju");
    }
    
    @Override
    public void realizarLimpeza() {
        System.out.println("Limpando um caju");
    } 
    
    @Override
    public Componente clone() {
        return (Componente)new Caju();
    }
   
}
