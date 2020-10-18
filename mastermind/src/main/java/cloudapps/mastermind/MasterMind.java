package cloudapps.mastermind;

import cloudapps.mastermind.controllers.Controller;
import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.View;

public abstract class MasterMind {

	private Logic logic;
    private View view;

    protected MasterMind() {
    	this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
    	Controller controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
		} while (controller != null);
    }
    
}
