package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.utils.YesNoDialog;

public class ResumeView {

	private Game game;
	
	public ResumeView(Game game) {
		this.game = game;
	}

	public boolean interact() {
		boolean isResumed = new YesNoDialog().read(MessageView.RESUME.toString());
		if (isResumed){
			this.game.reset();
		}
		return isResumed;
	}

}
