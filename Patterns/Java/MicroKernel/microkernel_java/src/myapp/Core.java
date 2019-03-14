package myapp;

import interfaces.ICore;
import interfaces.IPluginController;
import interfaces.IUiController;

public class Core implements ICore {
    IPluginController pluginController;
    IUiController uiController;
    
    public Core(){
        pluginController = new PluginController();
        uiController = new UiController();
        pluginController.initialize(this);
        uiController.initialize();
    }

    @Override
    public IUiController getUiController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPluginController getPluginController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
