/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import negocio.MeleeToMageAdapter;
import negocio.Knight;

/**
 *
 * @author alison
 */
public class AdapterExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Knight joao = new Knight();
        joao.attack();
        joao.block();
        joao.run();
        MeleeToMageAdapter adapter = new MeleeToMageAdapter();
        
        adapter.attack();
        adapter.block();
        adapter.run();
           
    }
    
}
