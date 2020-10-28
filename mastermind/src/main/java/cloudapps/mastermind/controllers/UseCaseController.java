package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Session;

public abstract class UseCaseController {

	protected Session session;

	UseCaseController(Session session) {
		this.session = session;
	}

	public int getCombinationWidth() {
		return this.session.getCombinationWidth();
	}

}
