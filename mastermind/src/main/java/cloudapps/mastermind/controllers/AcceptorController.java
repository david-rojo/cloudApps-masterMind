package cloudapps.mastermind.controllers;

import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;

public abstract class AcceptorController  extends Controller {
	
protected TCPIP tcpip;
    
    AcceptorController(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	public abstract void accept(ControllersVisitor controllersVisitor);
	
	public int getCombinationWidth() {
		return this.session.getCombinationWidth();
	}
	
}
