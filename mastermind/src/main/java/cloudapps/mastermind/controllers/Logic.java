package cloudapps.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.StateValue;

public class Logic {
	
	private Session session;
	private Map<StateValue, AcceptorController> acceptorControllers;
	protected StartController startController;
	protected PlayController playController;
	protected ResumeController resumeController;
	private TCPIP tcpip;
		
	public Logic(boolean isStandalone) {
		if (isStandalone) {
			this.tcpip = null;
		} else {
			this.tcpip = TCPIP.createClientSocket();
		}
		this.session = new Session(this.tcpip);
		this.acceptorControllers = new HashMap<StateValue, AcceptorController>();
		this.startController = new StartController(this.session, this.tcpip);
		this.acceptorControllers.put(StateValue.INITIAL, this.startController);
		this.playController = new PlayController(this.session, this.tcpip);
		this.acceptorControllers.put(StateValue.IN_GAME, this.playController);
		this.resumeController = new ResumeController(this.session, this.tcpip);
		this.acceptorControllers.put(StateValue.RESUME, this.resumeController);
		this.acceptorControllers.put(StateValue.EXIT, null);
	}
	
	public AcceptorController getController() {
		return this.acceptorControllers.get(this.session.getValueState());
	}
	
	public void close() {
		this.tcpip.close();
	}
	
}
