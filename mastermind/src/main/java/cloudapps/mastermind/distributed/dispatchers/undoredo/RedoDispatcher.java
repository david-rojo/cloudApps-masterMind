package cloudapps.mastermind.distributed.dispatchers.undoredo;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	public RedoDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).redo();
	}

}
