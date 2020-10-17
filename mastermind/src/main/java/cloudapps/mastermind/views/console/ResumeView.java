package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.YesNoDialog;

public class ResumeView extends SubView{

	public ResumeView(Game game) {
		super(game);
	}

	public boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
