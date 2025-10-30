package game.simple;

import java.util.Random;

public class Dragon extends Enemy {
	int power;
	int reward;
	int winRatio;
	
	Dragon(int power, int reward, int winRatio) {
		this.power = power;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if (val < winRatio) {
			System.out.println("Dragon Win!!");
			damage(player);
		} else {
			System.out.println("Player Win!!");
			reward(player);
		}
	}
	
	void damage(Player player) {
		player.health -= power;
	}
	
	void reward(Player player) {
		player.money += reward;
	}
}
