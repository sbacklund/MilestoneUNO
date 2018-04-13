package application;

import java.util.ArrayList;
import java.util.Collections;

//Knute Backlund
//CST-105
//March 2018
//This is my own code
public class Deck {
	private ArrayList<Card> theDeck;

	public Deck() {
		// make the deck
		theDeck = new ArrayList<Card>();
		// 8 #1-9 , draw 2, skip, reverse
		// 4 colors
		// 4 0's wild, wild draw four
		// make the Card and add them to deck
		// number = String.valueOf(n);
		// theDeck.add(new Card(color, number));
		String number = "";

		// 0 red
		// 1 yellow
		// 2 green
		// 3 blue
		for (int color = 0; color < 4; color++) {
			if (color == 0) {
				for (int n = 1; n < 10; n++) {
					number = String.valueOf(n);
					theDeck.add(new Card("red", number));
					theDeck.add(new Card("red", number));
				}
				theDeck.add(new Card("red", "0"));
				theDeck.add(new Card("", "wild"));
				theDeck.add(new Card("", "wild draw 4"));
				theDeck.add(new Card("red", "skip"));
				theDeck.add(new Card("red", "draw 2"));
				theDeck.add(new Card("red", "reverse"));
				theDeck.add(new Card("red", "skip"));
				theDeck.add(new Card("red", "draw 2"));
				theDeck.add(new Card("red", "reverse"));
			}
			if (color == 1) {
				for (int n = 1; n < 10; n++) {
					number = String.valueOf(n);
					theDeck.add(new Card("yellow", number));
					theDeck.add(new Card("yellow", number));
				}
				theDeck.add(new Card("yellow", "0"));
				theDeck.add(new Card("", "wild"));
				theDeck.add(new Card("", "wild draw 4"));
				theDeck.add(new Card("yellow", "skip"));
				theDeck.add(new Card("yellow", "draw 2"));
				theDeck.add(new Card("yellow", "reverse"));
				theDeck.add(new Card("yellow", "skip"));
				theDeck.add(new Card("yellow", "draw 2"));
				theDeck.add(new Card("yellow", "reverse"));
			}
			if (color == 2) {
				for (int n = 1; n < 10; n++) {
					number = String.valueOf(n);
					theDeck.add(new Card("green", number));
					theDeck.add(new Card("green", number));
				}
				theDeck.add(new Card("green", "0"));
				theDeck.add(new Card("", "wild"));
				theDeck.add(new Card("", "wild draw 4"));
				theDeck.add(new Card("green", "skip"));
				theDeck.add(new Card("green", "draw 2"));
				theDeck.add(new Card("green", "reverse"));
				theDeck.add(new Card("green", "skip"));
				theDeck.add(new Card("green", "draw 2"));
				theDeck.add(new Card("green", "reverse"));
			}
			if (color == 3) {
				for (int n = 1; n < 10; n++) {
					number = String.valueOf(n);
					theDeck.add(new Card("blue", number));
					theDeck.add(new Card("blue", number));
				}
				theDeck.add(new Card("blue", "0"));
				theDeck.add(new Card("", "wild"));
				theDeck.add(new Card("", "wild draw 4"));
				theDeck.add(new Card("blue", "skip"));
				theDeck.add(new Card("blue", "draw 2"));
				theDeck.add(new Card("blue", "reverse"));
				theDeck.add(new Card("blue", "skip"));
				theDeck.add(new Card("blue", "draw 2"));
				theDeck.add(new Card("blue", "reverse"));
			}

		}

	}

	public String toString() {
		String str = "";
		for (Card c : theDeck) {
			str += c + " ";
		}
		return str;
	}

	public void Shuffle() {
		Collections.shuffle(theDeck);
	}

	public Card deal() {
		Card c;
		c = theDeck.get(theDeck.size() - 1);
		// remove card
		theDeck.remove(theDeck.size() - 1);
		return c;
	}

	public boolean isEmpty() {
		if (theDeck.isEmpty())
			return true;
		else
			return false;
	}

	public void recieveCard(Card c) {
		theDeck.add(c);

	}
	//

}
