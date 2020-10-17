package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Game;

public class StartView {

	private Game game;
	
	public StartView(Game game) {
		this.game = game;
	}
	
	public void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView(game.getSecretCombination()).writeln();
	}

}
