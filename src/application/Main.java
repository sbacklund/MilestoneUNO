package application;

import java.util.ArrayList;

//This is my own code
//Knute Backlund
//CST-105

public class Main {
	public static ArrayList<userHand> players;
	public static boolean reverse = false;
	public static Deck gameDeck = new Deck();
	public static int nextP = 0;
	public static userHand currentPlayer;

	public static void main(String[] args) {

		gameDeck.Shuffle();
		players = new ArrayList<>();
		userHand p1 = new userHand(), p2 = new userHand(), p3 = new userHand(), p4 = new userHand();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);

		for (int i = 0; i < 7; i++) {
			p1.getCard(gameDeck.deal());
			p2.getCard(gameDeck.deal());
			p3.getCard(gameDeck.deal());
			p4.getCard(gameDeck.deal());
		}
		DisCard disPile = new DisCard();
		disPile.setTop(gameDeck.deal());
		while (Winner() == false) {

			// System.out.println(gameDeck);
			// System.out.println("player 1:" + p1);
			// System.out.println("Player 2:" + p2);
			// System.out.println("Player 3:" + p3);
			// System.out.println("Player 4:" + p4);
			while (gameDeck.isEmpty() == false) {
				// System.out.println("test innerloop");
				System.out.println(players.get(nextP));
				Card C = players.get(nextP).playCard(disPile.getTop());
				disPile.setTop(C);
				nextPlayer(disPile.getTop());
				System.out.println(players.get(nextP) + " is Next Player");

			}
			///////////////////////////////////////////////////
			Card top = disPile.dipTopCard();
			while (disPile.isEmpty() == false) {
				gameDeck.recieveCard(disPile.dipTopCard());
			}
			disPile.setTop(top);
			gameDeck.Shuffle();
			///////////////////////////////////////////////////
		}
	}

	public static void nextPlayer(Card n) {
		int factor = 1;

		int playerCount = 0;
		playerCount = players.size();

		// if n is normal proceed through players list
		if (n.isNorm()) {
			nextP = (nextP + factor + 4) % playerCount;
		}
		// if n is skip next player is +2
		else if (n.isSkip()) {
			nextP = (nextP + 2 + factor + 4) % playerCount;
		}
		// if n is reverse next player -1
		else if (n.isRev()) {
			factor *= -1;
			nextP += (nextP + factor + 4) % playerCount;
		}

	}

	public static boolean Winner() {
		if (players.get(0).isEmpty())
			return true;
		if (players.get(2).isEmpty())
			return true;
		if (players.get(3).isEmpty())
			return true;
		if (players.get(1).isEmpty())
			return true;
		else
			return false;

	}

}
