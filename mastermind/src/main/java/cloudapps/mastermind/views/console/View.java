package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Logic;


public class View extends cloudapps.mastermind.views.View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View(Logic logic) {
		this.startView = new StartView(logic);
		this.playView = new PlayView(logic);
		this.resumeView = new ResumeView(logic);
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
