package com.skilldistillery.comman.cards;

import java.util.ArrayList;
import java.util.List;

abstract public class Hand {
	protected List<Card> hand;


	public abstract int getHandValue();


	
	public Hand() {
	
		hand = new ArrayList<>();

	}

	public void addCard(Card card) {
	
		hand.add(card);
	}
	public void clear() {
		hand = new ArrayList<>();
	}



	
}
