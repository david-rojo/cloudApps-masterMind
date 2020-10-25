package cloudapps.mastermind.views.console;

import cloudapps.mastermind.types.Color;
import cloudapps.utils.Console;

class ColorView extends cloudapps.mastermind.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
