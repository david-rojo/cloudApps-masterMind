package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.utils.Console;

abstract class Command extends cloudapps.utils.Command {

	protected PlayController playController;
	protected Console console;

	protected Command(String title, PlayController playController) {
		super(title);
		this.playController = playController;
		this.console = new Console();
	}

}
