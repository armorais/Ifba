package myapp;

import interfaces.IUiController;

public class UiController implements IUiController {
    private MainWindow window;
    
    @Override
    public boolean initialize() {
        window = new MainWindow();
        this.window.setVisible(true);
        return true;
    }

}
