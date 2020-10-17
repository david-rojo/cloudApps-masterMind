package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Color;
import cloudapps.mastermind.utils.Console;

public class ColorView {

	private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

	private Color color;

	public ColorView(Color color) {
		this.color = color;
	}

	public static Color getInstance(char character) {
		for(int i=0; i<ColorView.INITIALS.length; i++) {
			if (ColorView.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
	public void writeln() {
		Console.instance().writeln(ColorView.INITIALS[this.color.ordinal()]);
	}
	
	public void write() {
		Console.instance().write(ColorView.INITIALS[this.color.ordinal()]);
	}
	
	public static String getInitials() {
		String initials = "";
		for (char c : INITIALS) {
			initials += c;
		}
		return initials;
	}

}
