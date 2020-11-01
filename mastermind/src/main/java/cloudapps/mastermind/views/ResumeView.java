package cloudapps.mastermind.views;

import cloudapps.utils.YesNoDialog;

public class ResumeView {

	public boolean read() {
		MessageView.RESUME.write();
		return new YesNoDialog().read();
	}

}
