package com.skilldistillery.comman.cards;

import java.util.Scanner;

public class CardTest {
  public static void main(String[] args) {
//		Rank[] ranks = Rank.values();
//		for (int i = 0; i < ranks.length; i++) {
//			System.out.println(ranks[i] + " " + ranks[i].getValue());
//		}
//
//		for (Suit s : Suit.values()) {
//			System.out.println(s);
//		}
//  }
	  Deck deck = new Deck();
	  deck.shuffle();
	  
	  
	 Scanner kb = new Scanner(System.in);
	 System.out.println("how many cards?");
	 
	 try {
		int num = kb.nextInt();
		if(num > deck.checkSize()) {
			System.out.println("enter a better number");
		}else {
			int value = 0;
			for(int i = 0; i < num; i++) {
				Card c = deck.dealCard();
				value += c.getValue();
				System.out.println(c);
			}
		System.out.println("your value is " + value);
		}
		
	} catch (Exception e) {
	System.out.println("enter a valid number");
	}
	  
  }
}
