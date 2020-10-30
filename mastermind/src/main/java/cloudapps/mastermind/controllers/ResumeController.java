package cloudapps.mastermind.controllers;

import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;

public class ResumeController extends AcceptorController {

	public ResumeController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}

	public void resume(boolean newGame) {
		if (this.tcpip == null) {
			if (newGame){
				this.session.reset();
			} else {
				this.session.next();
			}
		} else {
			this.tcpip.send(FrameType.NEW_GAME.name());
			this.tcpip.send(newGame);
		}
	}

	@Override
	public void accept(ControllersVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}