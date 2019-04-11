package subjects;

import interfaces.Subject;

public class Radio extends Subject {
	
	public void playSong() {
		System.out.println("**The radio started playing a song!**");
		notifyObservers("the radio started playing a song");
	}
	
}
