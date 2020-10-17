package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Game;

public abstract class View {

	protected Game game;

	public View(Game game) {
		this.game = game;
	}

	public void interact() {
		boolean playGame = true;
		do {
			this.start();
			boolean endGame;
			do {
				endGame = this.play(); 
			} while (!endGame);
			playGame = this.isNewGame();
		} while (playGame);
	}

	protected abstract void start();
	protected abstract boolean play();
	protected abstract boolean isNewGame();

}
