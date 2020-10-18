package cloudapps.mastermind;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.View;

public abstract class MasterMind {

	private Logic logic;
    private View view;

    protected MasterMind() {
    	this.logic = new Logic();
        this.view = this.createView(this.logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        this.view.interact();
    }
    
}
