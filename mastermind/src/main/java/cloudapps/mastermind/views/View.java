package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.Controller;
import cloudapps.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(Controller controller) {
		controller.accept(this);
	}

}
