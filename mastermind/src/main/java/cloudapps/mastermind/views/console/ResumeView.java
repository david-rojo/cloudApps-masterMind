package cloudapps.mastermind.views.console;

import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

public class ResumeView {

	public boolean read() {
		MessageView.RESUME.write();
		return new YesNoDialog().read();
	}

}
