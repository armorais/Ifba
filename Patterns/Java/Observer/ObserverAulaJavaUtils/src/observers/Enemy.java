package observers;

import java.util.Observable;
import java.util.Observer;
import subjects.Player;
import subjects.Radio;

@SuppressWarnings("deprecation")
public class Enemy implements Observer {

	private String name;
	
	public Enemy(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable observable, Object arg1) {
		if(observable instanceof Radio)
			System.out.println("Enemy " + name + " became cautious because " + arg1);	
		else if (observable instanceof Player)
			System.out.println("Enemy " + name + " is on FULL ALERT because " + arg1);
		else
			System.out.println(("Enemy " + name + " is curious because " + arg1));
	}

}
