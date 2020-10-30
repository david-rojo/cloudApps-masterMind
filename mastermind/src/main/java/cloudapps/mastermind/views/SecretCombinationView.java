package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	private AcceptorController controller;
	
	SecretCombinationView(AcceptorController controller) {
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
