/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import interfaces.IMage;

/**
 *
 * @author alison
 */
public class MeleeToMageAdapter implements interfaces.IMeleePlayer {    
    
    private IMage mage;
    
    public MeleeToMageAdapter(Mage mago) {
        this.mage = mago;
    }
    
    @Override
    public void attack() {
        mage.destructionMagic();
    }
    
    @Override
    public void block(){
        mage.forceField();
    }
    
    @Override
    public void run(){
        mage.teleport();
    }  
    
}
