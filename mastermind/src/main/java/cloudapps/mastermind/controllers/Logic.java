package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.models.Result;

public class Logic {

	private Game game;
	private StartController startController;
	private PlayController playController;
	private ResumeController resumeController;

	public Logic() {
		this.game = new Game();
		this.startController = new StartController(this.game);
		this.playController = new PlayController(this.game);
		this.resumeController = new ResumeController(this.game);
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.playController.addProposedCombination(proposedCombination);
	}
	
	public ProposedCombination getProposedCombination(int position) {
		return this.playController.getProposedCombination(position);
	}
	
	public Result getResult(int position) {
		return this.playController.getResult(position);
	}
	
	public int getAttempts() {
		return this.playController.getAttempts();
	}

	public boolean isLooser() {
		return this.playController.isLooser();
	}
	
	public boolean isWinner() {
		return this.playController.isWinner();
	}

	public void resume() {
		this.resumeController.resume();
	}
	
}
