package game.simple;

import java.util.Random;

public class Mouse extends Enemy {
	int food;
	int reward;
	int winRatio;
	
	Mouse(int food, int reward, int winRatio) {
		this.food = food;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if (val < winRatio) {
			System.out.println("Mouse Win!!");
			damage(player);
		} else {
			System.out.println("Player Win!!");
			reward(player);
		}
	}
	
	void damage(Player player) {
		player.food -= food;
	}
	
	void reward(Player player) {
		player.food += reward;
	}
}
