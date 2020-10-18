package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Game;

public abstract class Controller {

	protected Game game;

	Controller(Game game) {
		this.game = game;
	}

}
