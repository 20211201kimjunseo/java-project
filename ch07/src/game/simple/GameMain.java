package game.simple;

import java.util.Random;

public class GameMain {

	public static void main(String[] args) {
		Player player = new Player(100, 100, 100);
		Dragon dragon = new Dragon(30, 20, 50);
		Thief thief = new Thief(30, 20, 50);
		Mouse mouse = new Mouse(30, 20, 50);
			
		Enemy[] enemys = {dragon, thief, mouse};
		Random random = new Random();
		
		while (player.isAlive()) {
			int val = random.nextInt(enemys.length);
//			if (val == 0) {
//				dragon.attack(player);
//			}
//			else if (val == 1) {
//				thief.attack(player);
//			}
//			else {
//				mouse.attack(player);
//			}
			enemys[val].attack(player);
		}
	}
}
