package com.skilldistillery.comman.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;

	public Deck() {
		deck = createDeck();
	}

	private List<Card> createDeck() {
		deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));

			}

		}
		return deck;
	}

	public int checkSize() {
		return deck.size();
	}

	public Card dealCard() {
		return deck.remove(0);
	}

//	public void dealCard(Hand hand) {
//		hand.addCard(deck.remove(0));
//	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
