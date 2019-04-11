package subjects;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Player extends Observable {

	public void shoot() {
		System.out.println("**Player fired his gun!**");
	    setChanged();
		notifyObservers("the player fired his gun");
		clearChanged();
	}
	
}
