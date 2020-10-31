package cloudapps.mastermind.controllers.implementation;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	private SessionImplementation sessionImplementation;

	public ResumeControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	@Override
	public void resume(boolean newGame) {
		if (newGame) {
			this.sessionImplementation.reset();;
		} else {
			this.sessionImplementation.next();
		}
	}

	@Override
	public int getCombinationWidth() {
		return this.sessionImplementation.getCombinationWidth();
	}

}
