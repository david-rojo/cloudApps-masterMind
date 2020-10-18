package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.State;

public class StartController extends UseCaseController {

	StartController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
