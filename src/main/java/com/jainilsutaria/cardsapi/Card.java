package com.jainilsutaria.cardsapi;

public class Card {
	
	private Num num;
	private Suit suit;
	
	public Card(Num n, Suit s) {
		this.setNum(n);
		this.setSuit(s);
	}
	
	public Card(Suit s, Num n) {
		this.setNum(n);
		this.setSuit(s);
	}

	public Num getNum() {
		return num;
	}

	public void setNum(Num num) {
		this.num = num;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
