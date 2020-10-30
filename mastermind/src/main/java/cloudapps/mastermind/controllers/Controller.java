package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.StateValue;

public abstract class Controller {
    
	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public StateValue getValueState() {
		return this.session.getValueState();
	}
}