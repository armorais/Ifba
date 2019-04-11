package subjects;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Radio extends Observable {
	
	public void playSong() {
		System.out.println("**The radio started playing a song!**");
	    setChanged();
		notifyObservers("a song is playing somewhere");
		clearChanged();
	}
	
}
