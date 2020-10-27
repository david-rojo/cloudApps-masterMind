package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.UseCaseController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	private UseCaseController controller;
	
	SecretCombinationView(UseCaseController controller) {
		super();
		this.controller = controller;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getCombinationWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
