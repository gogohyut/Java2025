package game.simple;

import java.util.Random;

public class Mouse extends Enemy {
	int food;
	int reward;
	int winRatio = 50;
	
	Mouse(int food, int reward, int winRatio) {
		this.food = food;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val < 50) {
			System.out.println("Mouse Win!!");
			Damage(player);
		}
		else {
			System.out.println("Player Win!!");
			Reward(player);
		}
		
	}
	
	void Damage(Player player) {
		player.money -= food;
	}
	
	void Reward(Player player ) {
		player.money += reward;
	}
}
