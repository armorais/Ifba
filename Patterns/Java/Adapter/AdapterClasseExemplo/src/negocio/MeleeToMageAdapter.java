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
public class MeleeToMageAdapter extends Mage implements interfaces.IMeleePlayer {
    
    @Override
    public void attack() {
        destructionMagic();
    }
    
    @Override
    public void block(){
        forceField();
    }
    
    @Override
    public void run(){
        teleport();
    }

}
