package cloudapps.mastermind.distributed.dispatchers;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;

public class AddProposedCombinationDispatcher extends Dispatcher {

	public AddProposedCombinationDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<((PlayController)this.acceptorController).getCombinationWidth(); i++) {
			colors.add(this.tcpip.receiveColor());
		}
		((PlayController)this.acceptorController).addProposedCombination(colors);
	}
}
