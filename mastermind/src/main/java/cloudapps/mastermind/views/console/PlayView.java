package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.utils.WithConsoleView;

class PlayView extends WithConsoleView {

	void interact(PlayController playController) {
		new PlayMenu(playController).execute();		
	}

}
