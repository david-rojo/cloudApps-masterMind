package cloudapps.mastermind.distributed.dispatchers.errors;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.distributed.dispatchers.Dispatcher;
import cloudapps.mastermind.types.Color;

public class ErrorsProposedCombinationDispatcher extends Dispatcher {

	public ErrorsProposedCombinationDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<((PlayController) this.acceptorController).getCombinationWidth(); i++) {
			colors.add(this.tcpip.receiveColor());
		}
		this.tcpip.send(((PlayController) 
				this.acceptorController).getProposedCombinationError(colors));
	}
}