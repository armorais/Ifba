package subjects;

import interfaces.Subject;

public class Player extends Subject {

	public void shoot() {
		System.out.println("**Player fired his gun!**");
		notifyObservers("the player fired his gun");
	}
	
}
