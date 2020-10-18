package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;


public class View extends cloudapps.mastermind.views.View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View(PlayController playController, ResumeController resumeController) {
		this.startView = new StartView();
		this.playView = new PlayView(playController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected boolean play(){
		return this.playView.interact();
	}

	@Override
	protected boolean isNewGame(){
		return this.resumeView.interact();
	}

}
