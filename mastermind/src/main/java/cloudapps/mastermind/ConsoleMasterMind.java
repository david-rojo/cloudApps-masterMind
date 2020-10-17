package cloudapps.mastermind;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.console.View;

public class ConsoleMasterMind extends MasterMind {

	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new ConsoleMasterMind().play();
	}
	
}
