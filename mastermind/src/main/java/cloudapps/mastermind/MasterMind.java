package cloudapps.mastermind;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.controllers.UseCaseController;

public class MasterMind {

	private Logic logic;

    public MasterMind() {
    	this.logic = new Logic();
    }

    protected void play() {
    	UseCaseController controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
            	controller.control();
            }
		} while (controller != null);
    }
    
    public static void main(String[] args) {
		new MasterMind().play();
	}
    
}
