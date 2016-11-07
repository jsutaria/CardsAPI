package com.jainilsutaria.cardsapi;

public enum Num {
	NUM_2(2),
	NUM_3(3),
	NUM_4(4),
	NUM_5(5),
	NUM_6(6),
	NUM_7(7),
	NUM_8(8),
	NUM_9(9),
	NUM_10(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);
	
	private int simple;
	
	private Num(int s) {
		this.setSimple(s);
	}
	
	public int simple() {
		return simple;
	}
	
	public void setSimple(int simple) {
		this.simple = simple;
	}
}
