package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Error;
import cloudapps.utils.Console;

public class ErrorView extends cloudapps.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}
}
