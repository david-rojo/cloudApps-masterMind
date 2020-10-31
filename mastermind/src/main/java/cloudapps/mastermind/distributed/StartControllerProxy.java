package cloudapps.mastermind.distributed;

import cloudapps.mastermind.controllers.StartController;
import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;

public class StartControllerProxy extends StartController {

	private TCPIP tcpip;
	
	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}

	@Override
	public int getCombinationWidth() {
		this.tcpip.send(FrameType.COMBINATION_WIDTH.name());
		return this.tcpip.receiveInt();
	}

}
