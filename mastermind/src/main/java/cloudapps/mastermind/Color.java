package cloudapps.mastermind;

import cloudapps.mastermind.Color;
import cloudapps.mastermind.utils.Console;

public enum Color {
	RED('r'), 
	BLUE('b'), 
	YELLOW('y'), 
	GREEN('g'), 
	ORANGE('o'), 
	PURPLE('p'),
	NULL_COLOR;
	
	private char initial;

	private Color() {
	}

	private Color(char initial) {		
		this.initial = initial;
	}
	
	public boolean isNull() {		
		return this == Color.NULL_COLOR;
	}
	
	public static Color get(int index){		
		return Color.values()[index];
	}

	public void write() {		
		assert this != Color.NULL_COLOR;
		Console.instance().write(this.initial);
	}
	
	public static int length() {
		return Color.values().length-1;
	}
	
	public static Color getInstance(char character) {
		for(int i=0; i<Color.length(); i++) {
			if (Color.get(i).initial == character) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}

	public static String getInitials() {
		String initials = "";
		for (int i=0; i<Color.length(); i++) {
			initials += Color.get(i).initial;
		}
		return initials;
	}
}
