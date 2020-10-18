package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.State;

public class ResumeController extends UseCaseController {

	public ResumeController(Game game, State state) {
		super(game, state);
	}

	public void resume() {
		this.game.reset();
		this.state.reset();
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
