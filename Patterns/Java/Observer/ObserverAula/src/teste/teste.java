package teste;

import interfaces.IObserver;
import observers.Enemy;
import subjects.Radio;
import subjects.Player;

public class teste {

	public static void main(String[] args) {
		
		Radio radio = new Radio();
		Player player = new Player();
		
		IObserver e1 = new Enemy("Sniper");
		IObserver e2 = new Enemy("Patrol");
		IObserver e3 = new Enemy("Machine Gunner");
		

		player.register(e1);
		player.register(e2);
		player.register(e3);
		
		radio.register(e2);
		radio.register(e3);
		
		
		radio.playSong();
		
		System.out.println("-------");
		
		player.shoot();

	}

}
