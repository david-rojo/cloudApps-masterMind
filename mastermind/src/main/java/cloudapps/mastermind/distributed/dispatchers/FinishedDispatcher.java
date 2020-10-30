package cloudapps.mastermind.distributed.dispatchers;

import cloudapps.mastermind.controllers.PlayController;

public class FinishedDispatcher extends Dispatcher {

	public FinishedDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).isFinished());
	}
	
}
