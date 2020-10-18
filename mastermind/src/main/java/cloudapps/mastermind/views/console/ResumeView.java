package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

public class ResumeView {

	private ResumeController resumeController;

	public ResumeView(ResumeController resumeController){
		this.resumeController = resumeController;
	}

	public boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.resumeController.resume();
		}
		return newGame;
	}

}
