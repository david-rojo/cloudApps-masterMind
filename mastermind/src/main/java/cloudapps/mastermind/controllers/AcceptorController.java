package cloudapps.mastermind.controllers;

import cloudapps.mastermind.models.Session;

public abstract class AcceptorController extends Controller {
    
    AcceptorController(Session session) {
		super(session);
	}

    public abstract int getCombinationWidth();
    
	public abstract void accept(ControllersVisitor controllersVisitor);
	
}
