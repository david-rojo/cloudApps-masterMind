package cloudapps.mastermind;

import cloudapps.mastermind.controllers.AcceptorController;
import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.View;

public abstract class MasterMind {
	
	private Logic logic;
	private View view;
	
	protected MasterMind() {
		this.logic = new Logic(this.isStandalone());
		this.view = new View();
	}
	
	protected abstract boolean isStandalone();

	protected void play() {
		AcceptorController acceptorController;
		do {
			acceptorController = this.logic.getController();
			if (acceptorController != null) {
				this.view.interact(acceptorController);
			}
		} while (acceptorController != null); 
		if (!this.isStandalone()) {
			this.logic.close();
		}
	}
	
}

