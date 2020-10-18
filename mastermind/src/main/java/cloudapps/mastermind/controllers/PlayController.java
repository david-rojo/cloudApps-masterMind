package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.models.Result;

public class PlayController extends Controller {

	public PlayController(Game game) {
		super(game);
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.game.addProposedCombination(proposedCombination);
	}
	
	public ProposedCombination getProposedCombination(int position) {
		return this.game.getProposedCombination(position);
	}
	
	public Result getResult(int position) {
		return this.game.getResult(position);
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}

}
