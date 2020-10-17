package cloudapps.mastermind;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.console.View;

public class ConsoleMasterMind {

	private Game game;
	
	private View view;

	private ConsoleMasterMind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new ConsoleMasterMind().play();
	}	
}
