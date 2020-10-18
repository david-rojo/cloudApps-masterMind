package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.models.Result;
import cloudapps.mastermind.models.State;

public class PlayController extends Controller {

	public PlayController(Game game, State state) {
		super(game, state);
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.game.addProposedCombination(proposedCombination);
		if (this.game.isFinished()) {
			this.state.next();
		}
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
