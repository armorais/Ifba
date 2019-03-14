/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alison
 */
public class Knight implements interfaces.IMeleePlayer {
    
    @Override
    public void attack(){
        System.out.println("Atacking with sword");
    }
    
    @Override
    public void block(){
        System.out.println("Blocking with shield");
    }
    
    @Override
    public void run(){
        System.out.println("Running away");
    }
}
