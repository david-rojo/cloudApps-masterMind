package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Game;

public class View extends cloudapps.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Game game) {
		super(game);
		this.startView = new StartView(this.game);
		this.proposalView = new ProposalView(this.game);
		this.resumeView = new ResumeView(this.game);
	}

	@Override
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected boolean play(){
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame(){
		return this.resumeView.interact();
	}

}
