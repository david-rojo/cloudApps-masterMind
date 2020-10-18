package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.MessageView;

public class StartView extends SubView {

	StartView(Logic logic) {
		super(logic);
	}

	public void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();		
	}

}
