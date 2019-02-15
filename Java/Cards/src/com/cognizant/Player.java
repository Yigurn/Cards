package com.cognizant;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();

	public void addCard(Card card) {
		hand.add(card);
	}
	public void addCards(ArrayList<Card> cards) {
		hand.addAll(cards);
	}
	
	public int getSize() {
		return hand.size();
	}
	
}
