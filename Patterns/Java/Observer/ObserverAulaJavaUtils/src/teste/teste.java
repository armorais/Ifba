package teste;

import java.util.Observer;

import observers.Enemy;
import subjects.Radio;
import subjects.Player;

@SuppressWarnings("deprecation")
public class teste {

	public static void main(String[] args) {
		
		Radio radio = new Radio();
		Player player = new Player();
		
		Observer e1 = new Enemy("Sniper");
		Observer e2 = new Enemy("Patrol");
		Observer e3 = new Enemy("Machine Gunner");
		

		player.addObserver(e1);
		player.addObserver(e2);
		player.addObserver(e3);
		
		radio.addObserver(e2);
		radio.addObserver(e3);
		
		radio.playSong();
		
		System.out.println("-------");
		
		player.shoot();

	}

}
