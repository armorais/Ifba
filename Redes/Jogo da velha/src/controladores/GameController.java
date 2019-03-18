package controladores;

import interfaces.ICore;
import interfaces.IGameController;

public class GameController implements IGameController {
    
    ICore core = Core.instance();
    
    @Override
    public void initialize() {

    }

}
