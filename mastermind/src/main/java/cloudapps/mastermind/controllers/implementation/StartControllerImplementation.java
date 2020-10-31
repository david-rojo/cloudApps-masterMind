package cloudapps.mastermind.controllers.implementation;

import cloudapps.mastermind.controllers.StartController;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	SessionImplementation sessionImplementation;

	public StartControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}
	
	@Override
	public void start() {
		this.sessionImplementation.next();		
	}

	@Override
	public int getCombinationWidth() {
		return this.sessionImplementation.getCombinationWidth();
	}
}
