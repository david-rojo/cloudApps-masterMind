package cloudapps.mastermind.distributed.dispatchers;

import cloudapps.mastermind.controllers.PlayController;

public class ContinueStateDispatcher extends Dispatcher {

	public ContinueStateDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).continueState();
	}

}