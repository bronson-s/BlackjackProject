package com.skilldistillery.comman.cards;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		int value = 0;
		for (int i = 0; i < hand.size(); i++) {

			value += hand.get(i).getValue();

		}
	
		return value;
	}
	public boolean isBlackjack() {
		if(getHandValue() == 21) {
			return true;
		}else {
		return false;
		}
	}
	public boolean isBust() {
		if(getHandValue() > 21) {
			return true;
		}else{
			return false;
		}
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player Hand: ");
		builder.append(hand);

	
		return builder.toString();
	}

}
