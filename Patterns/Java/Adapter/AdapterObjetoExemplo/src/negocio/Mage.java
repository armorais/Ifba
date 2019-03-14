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
public class Mage implements interfaces.IMage {
    
    @Override
    public void destructionMagic() {
        System.out.println("Attacking with lightning");
    }

    @Override
    public void forceField() {
        System.out.println("Defending with a force field");
    }

    @Override
    public void teleport() {
        System.out.println("Teleporting away from the battlefield");
    }
    
}
