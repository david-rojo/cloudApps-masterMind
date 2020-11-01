package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Combination;
import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.models.Result;
import cloudapps.mastermind.models.State;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;
import cloudapps.mastermind.views.ColorView;
import cloudapps.mastermind.views.PlayView;

public class PlayController extends UseCaseController {

	public PlayController(Game game, State state) {
		super(game, state);
	}
	
	private void addProposedCombination(ProposedCombination proposedCombination) {
		this.game.addProposedCombination(proposedCombination);
		if (this.game.isFinished()) {
			this.state.next();
		}
	}
	
	private ProposedCombination getProposedCombination(int position) {
		return this.game.getProposedCombination(position);
	}
	
	private Result getResult(int position) {
		return this.game.getResult(position);
	}
	
	private int getAttempts() {
		return this.game.getAttempts();
	}

	private boolean isLooser() {
		return this.game.isLooser();
	}
	
	private boolean isWinner() {
		return this.game.isWinner();
	}
	
	private Error isValidProposedCombination(String proposal) {
		Error error = Error.NULL;
		if (proposal.length() > Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			ProposedCombination proposedCombination = new ProposedCombination();
			for (int i = 0; i < proposal.length(); i++) {
				Color color = ColorView.getInstance(proposal.charAt(i));
				if (color == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					if (proposedCombination.getColors().contains(color)) {
						error = Error.DUPLICATED;
					}
					else {
						proposedCombination.getColors().add(color);
					}					
				}
			}
		}
		return error;
	}

	@Override
	public void control() {
		Error error;
		String proposal;
		PlayView playView = new PlayView();
		do {
			playView.writeTitleProposedCombination();
			proposal = playView.readProposedCombination();
			error = this.isValidProposedCombination(proposal);
			if (!error.isNull()) {
				playView.writeErrorProposedCombination(error);
			}
		} while (!error.isNull());
		
		ProposedCombination proposedCombination = new ProposedCombination(proposal);
		this.addProposedCombination(proposedCombination);
		
		playView.writeAttempts(this.getAttempts());		
		playView.writeSecretCombination();
		
		for (int i = 0; i < this.getAttempts(); i++) {
			playView.writeProposedCombination(this.getProposedCombination(i));
			playView.writeResult(this.getResult(i));			
		}
		
		if (this.isWinner()) {
			playView.writeWinner();
		} else if (this.isLooser()) {
			playView.writeLooser();
		}		
	}

}
