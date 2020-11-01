package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Color;

public class ColorView {
	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};
	
	public static final char INVALID_COLOR = 0;

	protected Color color;

	public ColorView(Color color) {
		this.color = color;
	}

	public static Color getInstance(char character) {
		for (int i = 0; i < ColorView.INITIALS.length; i++) {
			if (ColorView.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
	public static String allInitials() {
		String result = "";
		for(char character: ColorView.INITIALS) {
			result += character;
		}
		return result;
	}
	
	public static char getChar(Color color) {
		for (int i = 0; i < ColorView.INITIALS.length; i++) {
			if (Color.values()[i] == color) {
				return ColorView.INITIALS[i];
			}
		}
		return getInvalidColor();
	}
	
	public static char getInvalidColor() {
		return INVALID_COLOR;
	}

}
