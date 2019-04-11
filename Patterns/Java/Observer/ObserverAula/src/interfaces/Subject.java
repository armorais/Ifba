package interfaces;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	public void register(IObserver observer) {
		observers.add(observer);
	}
	
	public void unregister(IObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String action) {
		for (IObserver observer : observers) {
			observer.update(this,action);
		}
	}
}
