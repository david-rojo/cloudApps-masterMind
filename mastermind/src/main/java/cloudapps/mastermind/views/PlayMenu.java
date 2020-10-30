package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.utils.Menu;

public class PlayMenu extends Menu {

	PlayMenu(PlayController playController) {
		this.addCommand(new PlayCommand(playController));
		this.addCommand(new UndoCommand(playController));
		this.addCommand(new RedoCommand(playController));
	}

}
