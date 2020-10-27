package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public abstract void interact(AcceptorController controller);
	
}
