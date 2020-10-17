package cloudapps.mastermind;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.graphics.View;

public class GraphicsMasterMind {
	
	private Game game;
	
	private View view;

	private GraphicsMasterMind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}	

}
