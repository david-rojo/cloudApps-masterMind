package cloudapps.mastermind;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.controllers.implementation.LogicImplementation;

public class MasterMindStandalone extends MasterMind{

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}

	public static void main(String[] args) {
		new MasterMindStandalone().play();
	}
}
