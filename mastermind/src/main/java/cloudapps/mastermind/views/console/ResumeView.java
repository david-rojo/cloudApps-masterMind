package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

public class ResumeView extends SubView {

	public ResumeView(Logic logic){
		super(logic);
	}

	public boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.logic.resume();
		}
		return newGame;
	}

}
