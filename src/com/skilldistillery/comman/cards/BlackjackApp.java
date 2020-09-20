package com.skilldistillery.comman.cards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackjackApp {
	boolean keepgoing = true;
	Scanner kb = new Scanner(System.in);
	static BlackjackApp b = new BlackjackApp();
	Player player = new Player();
	Dealer dealer = new Dealer();

	public static void main(String[] args) {

		b.run();
	}

	private void run() {
		b.startGame();
		b.playerMenu();

	}

	private void playerMenu() {
		int choice = 0;
		try {
			while (keepgoing) {
				System.out.println("What would you like to do?");
				System.out.println("1. Hit");
				System.out.println("2. Stay");
			
					choice = kb.nextInt();
			
				if (choice == 1) {
					player.playerHand.addCard(dealer.dealCard());
					System.out.println(player.playerHand.toString());
					if (player.playerHand.isBlackjack()) {
						System.out.println("Player wins!");
						playAgain();
					} else if (player.playerHand.isBust()) {
						System.out.println("dealer wins");
						playAgain();
					}
				} else if (choice == 2) {
					dealerTurn();
					keepgoing = false;
				}
				
			}
		} catch (Exception e) {
			System.out.println("please enter a valid number");
			kb.nextInt();
		}
	}

	private void playAgain() {
		System.out.println("would you like to play again?");
		int choice = 0;
		System.out.println("enter 1 to play again and 2 to quit");
		try {
			choice = kb.nextInt();
		if (choice == 1) {
			player.playerHand.clear();
			dealer.dealerHand.clear();
			b.run();
		}
		else if(choice == 2){
			keepgoing = false;
		}
		} catch (InputMismatchException e) {
			System.out.println("please enter 1 to play agian or 2 to quit");
			kb.nextInt();
		}
	}

	private void dealerTurn() {
		while (dealer.dealerHand.getHandValue() < 17) {
			System.out.println("hit");
			dealer.addCardToHand(dealer.dealCard());

		}
		dealer.displayCard();
		checkDealer();
	}

	private void checkDealer() {

		if (dealer.dealerHand.isBlackjack() == true) {
			System.out.println("*flip*");
			System.out.println(dealer.dealerHand.hand.get(0));
			System.out.println("Dealer wins");
			playAgain();
		} else if (dealer.dealerHand.isBust() == true) {
			System.out.println("*flip*");
			System.out.println(dealer.dealerHand.hand.get(0));
			System.out.println("the dealer busted");
			System.out.println("player wins");
			playAgain();

		} else {
            System.out.println("*flip*");
			System.out.println(dealer.dealerHand.hand.get(0));
			// System.out.println(dealer.dealerHand.getHandValue());
			checkWinner();
		}
	}
	
	private void checkWinner() {
	if(player.playerHand.getHandValue() <= dealer.dealerHand.getHandValue()) {
		System.out.println("Dealer wins");
		playAgain();
	}
	else if(player.playerHand.getHandValue() > dealer.dealerHand.getHandValue()) {
		System.out.println("Player wins");
		playAgain();
	} else {
		
	}
		
	}

	private void startGame() {

		System.out.println("Welcome");
		player.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		System.out.println(player.playerHand.toString());
		System.out.println(player.playerHand.getHandValue());
		dealer.displayCard();

	}

}