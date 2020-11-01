package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.State;
import cloudapps.mastermind.views.StartView;

public class StartController extends UseCaseController {

	StartController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void control() {
		this.state.next();
		new StartView().write();
	}

}
