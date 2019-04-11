package observers;

import interfaces.IObserver;
import interfaces.Subject;
import subjects.Player;
import subjects.Radio;

public class Enemy implements IObserver {

	private String name;
	
	public Enemy(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject subject, Object arg0) {
		if(subject instanceof Radio)
			System.out.println("Enemy " + name + " became cautious because " + arg0);	
		else if (subject instanceof Player)
			System.out.println("Enemy " + name + " is on FULL ALERT because " + arg0);
		else
			System.out.println(("Enemy " + name + " is curious because " + arg0));
	}
}
