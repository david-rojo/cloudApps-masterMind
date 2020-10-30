package cloudapps.mastermind.controllers;

import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;

public class StartController extends AcceptorController {

	public StartController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

	public void start() {
		if (this.tcpip == null) {
			this.session.next();	
		} else {
			this.tcpip.send(FrameType.START.name());
		}
	}
}
