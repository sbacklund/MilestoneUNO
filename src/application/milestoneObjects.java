package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Knute Backlund
//CST-105
//March 2018
//This is my own code

////////////////////////////////TESTER///////////////////////
public class milestoneObjects {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Card newCard = new Card("Wild", "green");
		// Card oldCard = new Card("skip", "green");
		// if (newCard.matchC(oldCard))
		// System.out.println("match");
		// else
		// System.out.println("Not a match");
		// System.out.println(newCard.toString());
		// System.out.println(oldCard.toString());
		Deck myDeck = new Deck();
		DisCard play = new DisCard();
		play.setTop(myDeck.deal());
		myDeck.Shuffle();
		PrintStream out = new PrintStream(new File(System.getProperty("user.home") + "\\Desktop\\out.out"));
		out.println(myDeck);
		// make 4 players
		userHand p1 = new userHand(), p2 = new userHand(), p3 = new userHand(), p4 = new userHand();
		// deal cards to players
		for (int i = 0; i < 7; i++) {
			p1.getCard(myDeck.deal());
			p2.getCard(myDeck.deal());
			p3.getCard(myDeck.deal());
			p4.getCard(myDeck.deal());

		}
		System.out.println(myDeck);
		System.out.println(p1);
		System.out.println(play.getTop());
		Card played = p1.playCard(play.getTop());
		if (played == null) {
			p1.getCard(myDeck.deal());
		} else {
			if (played.isWild()) {
				// start color picker;
				System.out.println("Pick a color:");
				System.out.println("red | yellow | green | blue");
				Scanner pickerC = new Scanner(System.in);
				String pickColor = pickerC.nextLine();
				System.out.println(pickColor);
				Card e = new Card(pickColor, "wild");
				play.setTop(e);
			} else {
				play.setTop(played);
			}
			System.out.println(p1);
			System.out.println(play.getTop());
		}
	}
}
