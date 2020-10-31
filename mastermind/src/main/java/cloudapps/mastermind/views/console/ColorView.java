package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Color;
import cloudapps.utils.Console;

public class ColorView extends cloudapps.mastermind.views.ColorView{

	ColorView(Color color) {
		super(color);
	}
	
	public void write() {
		Console.instance().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
