package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Game;

public class SubView {

	protected Game game;

	SubView(Game game) {
		assert game != null;

		this.game = game;
	}

}
