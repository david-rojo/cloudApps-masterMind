package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

public class ResumeView {

	public boolean interact(ResumeController resumeController) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			resumeController.resume();
		}
		else {
			resumeController.next();
		}
		return newGame;
	}

}
