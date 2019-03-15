/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.Componente;
import interfaces.FrutaFactory;
import negocio.frutas.Caju;
import negocio.frutas.Frutas;
import negocio.frutas.Laranja;
import negocio.frutas.Maca;


/**
 *
 * @author alison
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Componente frutas = new Frutas("Todas as frutas");
        Componente grandes = new Frutas("Frutas grandes");
        Componente pequenas = new Frutas("Frutas pequenas");        
        Componente grandesVerdes = new Frutas("Frutas grandes e verdes");
        Componente pequenasVerdes = new Frutas("Frutas pequenas e verdes");
        Componente grandesMaduras = new Frutas("Frutas grandes e maduras");
        Componente pequenasMaduras = new Frutas("Frutas pequenas e maduras");
              
        frutas.add(pequenas);
        frutas.add(grandes);
        
        grandes.add(grandesVerdes);
        grandes.add(grandesMaduras);
        
        pequenas.add(pequenasVerdes);
        pequenas.add(pequenasMaduras);
        
        FrutaFactory ff = new FrutaFactory();
        
        ff.addFruta(new Maca());
        ff.addFruta(new Caju());
        ff.addFruta(new Laranja());
        
        grandesVerdes.add(ff.getFruta("Maçã"));
        grandesVerdes.add(ff.getFruta("Maçã"));
        grandesVerdes.add(ff.getFruta("Caju"));
        pequenasMaduras.add(ff.getFruta("Maçã"));
        pequenasVerdes.add(ff.getFruta("Laranja"));
        
        pequenas.realizarLimpeza();
        
    }
    
}
