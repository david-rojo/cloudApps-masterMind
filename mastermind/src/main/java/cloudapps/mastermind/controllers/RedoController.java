package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.SessionImplementation;

public class RedoController extends Controller {

	private SessionImplementation sessionImplementation;

    public RedoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void redo() {
		this.sessionImplementation.redo();
	}

	public boolean redoable() {
		return this.sessionImplementation.redoable();
	}
	
}
