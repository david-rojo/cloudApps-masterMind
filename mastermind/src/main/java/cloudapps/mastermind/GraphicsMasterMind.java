package cloudapps.mastermind;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.views.graphics.View;

public class GraphicsMasterMind extends MasterMind {
	
	@Override
	protected View createView(Logic logic){
		return new View(logic);
	}

	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}

}
