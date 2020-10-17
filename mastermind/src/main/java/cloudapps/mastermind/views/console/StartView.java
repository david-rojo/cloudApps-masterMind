package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.MessageView;

public class StartView extends SubView {

	public StartView(Game game) {
		super(game);
	}

	public void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();		
	}

}
