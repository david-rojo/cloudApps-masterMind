package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Controller;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.controllers.StartController;


public class View extends cloudapps.mastermind.views.View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}
	
	@Override
	public void interact(Controller controller) {
		if (controller instanceof StartController) {
			this.startView.interact((StartController) controller);
		} else if (controller instanceof PlayController) {
			this.playView.interact((PlayController) controller);
		} else {
			this.resumeView.interact((ResumeController) controller);
		}
	}

}
