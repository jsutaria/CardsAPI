package com.jainilsutaria.cardsapi;

import java.util.Random;

public class Deck {

	public String id;
	
	public Deck(String s) {
		this.id = s;
	}
	
	private Card[] cards =  
		new Card[] {
			new Card(Num.ACE, Suit.CLUB),
			new Card(Num.ACE, Suit.DIAMOND),
			new Card(Num.ACE, Suit.HEART),
			new Card(Num.ACE, Suit.SPADE),
			new Card(Num.NUM_2, Suit.CLUB),
			new Card(Num.NUM_2, Suit.DIAMOND),
			new Card(Num.NUM_2, Suit.HEART),
			new Card(Num.NUM_2, Suit.SPADE),
			new Card(Num.NUM_3, Suit.CLUB),
			new Card(Num.NUM_3, Suit.DIAMOND),
			new Card(Num.NUM_3, Suit.HEART),
			new Card(Num.NUM_3, Suit.SPADE),
			new Card(Num.NUM_4, Suit.CLUB),
			new Card(Num.NUM_4, Suit.DIAMOND),
			new Card(Num.NUM_4, Suit.HEART),
			new Card(Num.NUM_4, Suit.SPADE),
			new Card(Num.NUM_5, Suit.CLUB),
			new Card(Num.NUM_5, Suit.DIAMOND),
			new Card(Num.NUM_5, Suit.HEART),
			new Card(Num.NUM_5, Suit.SPADE),
			new Card(Num.NUM_6, Suit.CLUB),
			new Card(Num.NUM_6, Suit.DIAMOND),
			new Card(Num.NUM_6, Suit.HEART),
			new Card(Num.NUM_6, Suit.SPADE),
			new Card(Num.NUM_7, Suit.CLUB),
			new Card(Num.NUM_7, Suit.DIAMOND),
			new Card(Num.NUM_7, Suit.HEART),
			new Card(Num.NUM_7, Suit.SPADE),
			new Card(Num.NUM_8, Suit.CLUB),
			new Card(Num.NUM_8, Suit.DIAMOND),
			new Card(Num.NUM_8, Suit.HEART),
			new Card(Num.NUM_8, Suit.SPADE),
			new Card(Num.NUM_9, Suit.CLUB),
			new Card(Num.NUM_9, Suit.DIAMOND),
			new Card(Num.NUM_9, Suit.HEART),
			new Card(Num.NUM_9, Suit.SPADE),
			new Card(Num.NUM_10, Suit.CLUB),
			new Card(Num.NUM_10, Suit.DIAMOND),
			new Card(Num.NUM_10, Suit.HEART),
			new Card(Num.NUM_10, Suit.SPADE),
			new Card(Num.JACK, Suit.CLUB),
			new Card(Num.JACK, Suit.DIAMOND),
			new Card(Num.JACK, Suit.HEART),
			new Card(Num.JACK, Suit.SPADE),
			new Card(Num.QUEEN, Suit.CLUB),
			new Card(Num.QUEEN, Suit.DIAMOND),
			new Card(Num.QUEEN, Suit.HEART),
			new Card(Num.QUEEN, Suit.SPADE),
			new Card(Num.KING, Suit.CLUB),
			new Card(Num.KING, Suit.DIAMOND),
			new Card(Num.KING, Suit.HEART),
			new Card(Num.KING, Suit.SPADE),
		};
	
	public void shuffle() {
		Random rnd = new Random();
	    for (int i = this.cards.length - 1; i > 0; i--) {
	    	int index = rnd.nextInt(i + 1);
		    Card a = this.cards[index];
		    this.cards[index] = this.cards[i];
		    this.cards[i] = a;
	    }
    }
	
	public boolean remove(Card c) {
		try {
			this.cards[getIndexOf(c)] = null;
			return true;
		} catch(IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	public boolean remove(int n) {
		try {
			this.cards[n] = null;
			return true;
		} catch(IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	public int getIndexOf(Card c) {
	    for (int i = this.cards.length - 1; i > 0; i--) 
	    	if(this.cards[i].equals(c)) return i;
	    return -1;
	}
	
	public Card getCardAt(int n) {
		return this.cards[n];
	}

	public Card[] getCards() {
		return this.cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
}
