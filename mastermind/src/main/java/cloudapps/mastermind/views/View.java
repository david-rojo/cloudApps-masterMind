package cloudapps.mastermind.views;

public abstract class View {

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
