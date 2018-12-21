/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myplugin1;

import interfaces.ICore;

/**
 *
 * @author alison
 */
public class myPlugin1 implements interfaces.IPlugin{

    @Override
    public boolean initialize(ICore core) {
        System.out.println("Inicializando o plugin MyPlugin1");
        return true;
    }
    
}
