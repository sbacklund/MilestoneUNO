package application;

//Knute Backlund
//CST-105
//March 2018
//This is my own code
import java.util.ArrayList;

public class DisCard {
	private ArrayList<Card> playPile;

	public DisCard() {
		playPile = new ArrayList<Card>();
	}

	public Card setTop(Card c) {
		playPile.add(c);
		return c;
	}

	public Card getTop() {
		Card c;
		c = playPile.get(playPile.size() - 1);
		return c;
	}

	public String toString() {
		String str = "";
		for (Card c : playPile) {
			str += c + " ";
		}
		return str;
	}

	public Card dipTopCard() {
		Card c;
		c = playPile.get(playPile.size() - 1);
		// remove card
		playPile.remove(playPile.size() - 1);
		return c;
	}

	public boolean isEmpty() {
		if (playPile.isEmpty())
			return true;
		else
			return false;
	}

}
