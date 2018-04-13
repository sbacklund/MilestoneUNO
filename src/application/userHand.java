package application;

//Knute Backlund
//CST-105
//March 2018
//This is my own code
import java.util.ArrayList;
import java.util.Random;

public class userHand {
	private ArrayList<Card> theHand;

	public userHand() {
		theHand = new ArrayList<Card>();

	}

	public void getCard(Card c) {
		theHand.add(c);

	}

	public boolean Uno() {
		if (theHand.size() == 1)
			return true;
		else
			return false;
	}

	public String toString() {
		String str = "";
		for (Card c : theHand) {
			str += c + " ";
		}
		return str;
	}

	public Card playCard(Card c) {
		for (int i = 0; i < theHand.size(); i++) {
			if (theHand.get(i).matchC(c)) {
				Card d = theHand.get(i);
				if (d.getColor().equals("")) {
					Random rnd = new Random();
					int n = rnd.nextInt(4) + 1;
					if (n == 1)
						d.setColor("Blue");
					if (n == 2)
						d.setColor("Yellow");
					if (n == 3)
						d.setColor("Red");
					if (n == 4)
						d.setColor("Green");
					else
						d.setColor("Blue");
				}
				theHand.remove(i);
				return d;
			}
		}
		// if (c.matchC(c))
		return null;
	}

	public boolean isEmpty() {
		return theHand.isEmpty();
	}

}
