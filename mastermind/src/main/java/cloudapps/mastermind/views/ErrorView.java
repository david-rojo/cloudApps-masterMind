package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Error;
import cloudapps.mastermind.utils.Console;

public class ErrorView {

	private static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.getInitials(), 
			"Wrong proposed combination length"
	};

	private Error error;

	ErrorView(Error error) {
		this.error = error;
	}

	public void writeln() {
		if (!error.isNull()){
			Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
		}
	}
}
