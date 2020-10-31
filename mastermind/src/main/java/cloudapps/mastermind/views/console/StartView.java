package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.StartController;
import cloudapps.mastermind.views.MessageView;

public class StartView {

	public void interact(StartController startController) {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();	
		startController.next();
	}

}
