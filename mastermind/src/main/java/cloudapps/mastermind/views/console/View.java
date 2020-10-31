package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.ControllerVisitor;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.controllers.StartController;
import cloudapps.mastermind.controllers.UseCaseController;


public class View extends cloudapps.mastermind.views.View implements ControllerVisitor {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}
	
	@Override
	public void interact(UseCaseController controller) {
		if (controller instanceof StartController) {
			this.startView.interact((StartController) controller);
		} else if (controller instanceof PlayController) {
			this.playView.interact((PlayController) controller);
		} else {
			this.resumeView.interact((ResumeController) controller);
		}
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);		
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);		
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

}
