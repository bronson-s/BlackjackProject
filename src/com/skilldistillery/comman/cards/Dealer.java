package com.skilldistillery.comman.cards;

public class Dealer {
	Deck deck;
	BlackjackHand dealerHand;

	public Dealer() {
		deck = new Deck();
		dealerHand = new BlackjackHand();
		deck.shuffle();
	}

	public Card dealCard() {

		return deck.dealCard();
	}
	public void addCardToHand(Card card) {
		dealerHand.addCard(card);
		
	}
	public void displayCard() {
		
		for(int i = 1; i < dealerHand.hand.size(); i++) {
		System.out.println("Dealer cards: " + "[" + dealerHand.hand.get(i) + "]");
	}
	
		
		
	}
}
