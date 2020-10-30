package cloudapps.mastermind.distributed.dispatchers;

import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;

public class ColorsOfPositionDispatcher extends Dispatcher {

	public ColorsOfPositionDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int position = this.tcpip.receiveInt();
		List<Color> colors = ((PlayController)this.acceptorController).getColors(position);
		for (Color color : colors) {
			this.tcpip.send(color);
		}
	}
}
