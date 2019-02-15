package com.cognizant;

public class Card {
	public Suit suit;
	public Rank rank;
	private int deckNumber;
	
	Card(Suit suit, Rank rank, int deckNumber) {
		this.suit = suit;
		this.rank = rank;
		this.deckNumber = deckNumber;
	}
	
	public String toString(boolean showDeck) {
		String value = "";
		value = rank.toString().substring(0, 1).toUpperCase() + rank.toString().substring(1).toLowerCase()
				+ " of " + suit.toString().substring(0, 1).toUpperCase() + suit.toString().substring(1).toLowerCase();
		if (showDeck) value += "_" + deckNumber;
		return value;
	}
	
	public String toStringShort(boolean showDeck) {
		String value = String.valueOf(rank.getRank());
		switch (value) {
		case "1":
			value = "A";
			break;
		case "14":
			value = "A";
			break;
		case "10":
			value = "T";
			break;
		case "11":
			value = "J";
			break;
		case "12":
			value = "Q";
			break;
		case "13":
			value = "K";
			break;
		}
		value += suit.toString().substring(0, 1);
		if (showDeck) value += "_" + deckNumber;
		return value;
	}
}
