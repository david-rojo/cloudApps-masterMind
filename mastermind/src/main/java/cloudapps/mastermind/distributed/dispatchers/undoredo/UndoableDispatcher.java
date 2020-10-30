package cloudapps.mastermind.distributed.dispatchers.undoredo;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

	public UndoableDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).undoable());
	}

}
