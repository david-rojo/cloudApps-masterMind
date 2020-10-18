package cloudapps.mastermind.views.console;

import cloudapps.mastermind.views.MessageView;

public class StartView {

	StartView() {
	}

	public void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();		
	}

}
