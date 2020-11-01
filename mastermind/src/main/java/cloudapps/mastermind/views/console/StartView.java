package cloudapps.mastermind.views.console;

import cloudapps.mastermind.views.MessageView;

public class StartView {

	public void write() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();	
	}

}
