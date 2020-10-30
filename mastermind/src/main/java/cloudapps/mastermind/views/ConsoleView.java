package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.mastermind.controllers.ControllersVisitor;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.controllers.StartController;

public class ConsoleView extends View implements ControllersVisitor {
	
	private StartView startView;
	private PlayView playView;	
	private ResumeView resumeView;
	
	public ConsoleView(){
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(AcceptorController controller) {
		controller.accept(this);
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
