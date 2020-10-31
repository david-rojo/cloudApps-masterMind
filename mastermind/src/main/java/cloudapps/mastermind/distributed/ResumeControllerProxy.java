package cloudapps.mastermind.distributed;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean newGame) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(newGame);	
	}

	@Override
	public int getCombinationWidth() {
		this.tcpip.send(FrameType.COMBINATION_WIDTH.name());
		return this.tcpip.receiveInt();
	}

}
