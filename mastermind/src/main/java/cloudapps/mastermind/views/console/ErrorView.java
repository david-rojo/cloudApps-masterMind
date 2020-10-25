package cloudapps.mastermind.views.console;

import cloudapps.mastermind.types.Error;
import cloudapps.utils.Console;

class ErrorView extends cloudapps.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
