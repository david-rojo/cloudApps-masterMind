package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

	private PlayController playController;

	AttemptsView(PlayController playController) {
		this.playController = playController;
	}

	void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.playController.getAttempts()));
	}

}
