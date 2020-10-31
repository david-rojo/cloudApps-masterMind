package cloudapps.mastermind.views.graphics;

import cloudapps.mastermind.controllers.ControllerVisitor;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.controllers.StartController;
import cloudapps.mastermind.controllers.UseCaseController;

/**
 * It is out of the scope of the exercise the graphic implementation of the game.
 * 
 * All the design and the analisis has been done taking in account that the game
 * can offer several types of views
 */

public class View extends cloudapps.mastermind.views.View implements ControllerVisitor {

	public View() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void interact(UseCaseController controller) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(StartController startController) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(PlayController playController) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(ResumeController resumeController) {
		// TODO Auto-generated method stub
		
	}

}
