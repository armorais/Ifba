package controladores;

import interfaces.IUiController;
import jogo.TicTacToe;

public class UiController implements IUiController {
    private TicTacToe window;
    
    @Override
    public boolean initialize() {
        window = new TicTacToe();
        
        
        
        //adicionar código
        
        
        
        
        return true;
    }

}
