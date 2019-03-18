package interfaces;

public abstract class ICore {
    
    protected static ICore instance = null;
    
    protected ICore() {
    }
    
    public static ICore instance(){
        return instance;
    }
    
    public abstract IUiController uiController();
    public abstract IGameController gameController();

}
