package com.cognizant;

public class KingsCross {
	private static int currentPlayer = 0;
	private int numberOfCardStacks;
	private boolean aceHigh = false;
	
	KingsCross() {
		for (int i = 0; i < 7; i++) {
			for (Player player:Game.players) {
				//player.addCard();
			}
		}
	}
}
