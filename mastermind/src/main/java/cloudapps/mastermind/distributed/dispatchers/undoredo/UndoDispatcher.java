package cloudapps.mastermind.distributed.dispatchers.undoredo;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

	public UndoDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).undo();
	}

}
