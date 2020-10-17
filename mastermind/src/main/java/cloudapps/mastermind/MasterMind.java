package cloudapps.mastermind;


import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.View;

public class MasterMind {

    private Game game;
	private View view;

	MasterMind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new MasterMind().play();
    }
    
}
