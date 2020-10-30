package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.mastermind.controllers.ControllersVisitor;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.controllers.StartController;

public class View implements ControllersVisitor {
	
	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;
	
	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}

	
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	
	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
	
}
