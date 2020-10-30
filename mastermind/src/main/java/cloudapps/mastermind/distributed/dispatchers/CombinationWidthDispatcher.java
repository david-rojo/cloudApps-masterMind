package cloudapps.mastermind.distributed.dispatchers;

import cloudapps.mastermind.controllers.PlayController;

public class CombinationWidthDispatcher extends Dispatcher {

	public CombinationWidthDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getCombinationWidth());
	}
}
