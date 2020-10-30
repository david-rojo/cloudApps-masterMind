package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
