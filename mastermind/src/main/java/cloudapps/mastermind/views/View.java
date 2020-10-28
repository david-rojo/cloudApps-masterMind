package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {
	
	public abstract void interact(AcceptorController controller);
	
}
