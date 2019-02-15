package com.cognizant;

import java.util.ArrayList;
import java.util.Collections;

public class CardStack {
	protected static int count = 1;
	
	protected ArrayList<Card> stack;
	protected int deckNumber;
	

	public int getSize() {
		return stack.size();
	}

	public ArrayList<Card> drawCards(int numberOfCards) {
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < numberOfCards; i++) {
			cards.add(stack.remove(getSize() - 1));
		}
		return cards;
	}

	public void addCard(Card card) {
		stack.add(card);
	}
	public void addCards(ArrayList<Card> cards) {
		stack.addAll(cards);
	}
	
	public void shuffleDeck() {
		Collections.shuffle(stack);
	}
	
	public String toString(boolean mode) {
		String cards = "Deck " + deckNumber + ": " + stack.size() + " Cards\r\n";
		
			int i = 0;
			for (Card card:stack) {
				cards += card.toStringShort(mode) + ", ";
				if (i++ == 12) {
					cards += "\r\n";
					i = 0;
				}
			}
		return cards;	
	}

}
