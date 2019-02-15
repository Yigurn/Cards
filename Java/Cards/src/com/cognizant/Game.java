package com.cognizant;

public class Game {
	private static int numberOfDecks = 1;
	private static int numberOfPlayers = 2;
	private static Deck stock = new Deck();
	public static Player[] players;
	
	Game() {
		Deck[] decks = new Deck[numberOfDecks];
		for (int i = 1; i < numberOfDecks; i++) {
			decks[i] = new Deck();
			stock.addCards(decks[i].drawCards(52));
		}
		stock.shuffleDeck();
		System.out.println(stock.toString(true));
		
		players = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player();
		}
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		KingsCross kc = new KingsCross();
		
		
		
		
		Deck cards = new Deck();
		cards.shuffleDeck();
		//Rank.ACE.setRank(14);
		//System.out.println(cards);
		//System.out.println(cards.toString(true));
		//System.out.println(cards2.toString(true));
		//ArrayList<Card> hand = cards.drawCards(5);
		//hand.addAll(cards2.drawCards(5));
//		//System.out.println(hand);
//		cards.addCards(cards2.drawCards(5));
//		System.out.println(cards.toString(true));
//		System.out.println(cards2.toString(true));
		
	}
	
	public static int getDecks() {
		return numberOfDecks;
	}
	public void setDecks(int numberOfDecks) {
		Game.numberOfDecks = numberOfDecks;
	}
	
	public int getPlayers() {
		return numberOfPlayers;
	}	
	public void setPlayers(int numberOfPlayers) {
		Game.numberOfPlayers = numberOfPlayers;
	}

}
