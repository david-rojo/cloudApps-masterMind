package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Game;


public class View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View(Game game) {
		this.startView = new StartView(game);
		this.playView = new PlayView(game);
		this.resumeView = new ResumeView(game);
	}

	public void interact() {
		boolean playGame = true;
		do {
			this.startView.interact();
			boolean endGame;
			do {
				endGame = this.playView.interact(); 
			} while (!endGame);
			playGame = this.resumeView.interact();
		} while (playGame);
	}

}
