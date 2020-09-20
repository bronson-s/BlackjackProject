package com.skilldistillery.comman.cards;

public class Player {
	BlackjackHand playerHand;

	public Player() {
		playerHand = new BlackjackHand();

	}
public void addCardToHand(Card card) {
	playerHand.addCard(card);
	
}
}
