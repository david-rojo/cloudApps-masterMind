package cloudapps.mastermind.views;

import cloudapps.mastermind.types.Color;
import cloudapps.utils.Console;

public class ColorView {

	protected Color color;

	public ColorView(Color color) {
		this.color = color;
	}

	static String allInitials() {
		return Color.getInitials();
	}

	char getInitial() {
		return Color.getInitial(this.color);
	}	

	void write() {
		new Console().write(Color.getInitial(this.color));
	}

}
