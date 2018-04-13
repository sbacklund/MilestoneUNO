package application;
//Knute Backlund

//CST-105
//March 2018
//This is my own code

public class Card {
	private String value;
	private String color;
	//////////////////////////////////////////////////////////////
	// Wild cards initially have a value == "wild" and color = ""
	///////////////////////////////////////////////////////////////
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	////////////////////////////////////////////////////////////
	public Card(String color, String value) {
		this.value = value;
		this.color = color;

	}

	//////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		if (this.color == "blue")
			return "[" + ANSI_BLUE + value + ANSI_RESET + "]";
		if (this.color == "yellow")
			return "[" + ANSI_YELLOW + value + ANSI_RESET + "]";
		if (this.color == "green")
			return "[" + ANSI_GREEN + value + ANSI_RESET + "]";
		if (this.color == "red")
			return "[" + ANSI_RED + value + ANSI_RESET + "]";
		if (this.color == "")
			return "[" + ANSI_BLACK + value + ANSI_RESET + "]";
		return null;
	}

	//////////////////////////////////////////////////////////////
	public boolean matchC(Card c) {
		// see if card is wild
		if (this.isWild()) {
			return true;
		}

		if (this.color.equals(c.color))
			return true;
		if (this.value.equals(c.value))
			return true;
		// not match
		else
			return false;

	}
	//////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////
	public boolean isWild() {
		if (color.equals(""))
			return true;
		else
			return false;

	}

	public String getColor() {
		return color;
	}

	public String getVal() {
		return value;
	}

	public boolean isRev() {
		if (this.value.equals("reverse")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNorm() {
		String num = "";
		for (int i = 0; i < 10; i++) {
			num = String.valueOf(i);
			if (this.value.equals(num)) {
				return true;
			}
		}
		return false;
	}

	public boolean isSkip() {
		if (this.value.equals("skip") || this.value.equals("draw 2") || this.value.equals("wild draw 4")) {
			return true;
		} else {
			return false;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

}
