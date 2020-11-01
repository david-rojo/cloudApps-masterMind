package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.State;
import cloudapps.mastermind.views.ResumeView;

public class ResumeController extends UseCaseController {

	public ResumeController(Game game, State state) {
		super(game, state);
	}
	
	private void resume(boolean newGame) {
		if (newGame) {
			this.game.reset();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	@Override
	public void control() {
		this.resume(new ResumeView().read());
	}


}
