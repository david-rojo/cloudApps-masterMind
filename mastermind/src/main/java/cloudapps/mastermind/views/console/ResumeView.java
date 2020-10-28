package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
