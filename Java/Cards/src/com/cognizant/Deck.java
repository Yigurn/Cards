package com.cognizant;

import java.util.ArrayList;

public class Deck extends CardStack {
	
	Deck() {
		deckNumber = count++;
		createDeck();
	}
	
	public void createDeck() {
		stack = new ArrayList<Card>();
		for (Suit suit:Suit.values()) {
			for (Rank rank:Rank.values()) {
				Card card = new Card(suit, rank, deckNumber);
				stack.add(card);
			}
		}	
	}
}
