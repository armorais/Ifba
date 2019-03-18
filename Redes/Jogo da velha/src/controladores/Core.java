package controladores;

import interfaces.ICore;
import interfaces.IUiController;
import interfaces.IGameController;

public class Core extends ICore {
    private static final IUiController uiController = new UiController();
    private static final IGameController gameController = new GameController();
    
    private Core(){
        
    }
    
    public static void initialize(){
        if (instance == null) {
            instance = new Core();
            uiController.initialize();
            gameController.initialize();
        }
    }

    @Override
    public IUiController uiController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IGameController gameController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
