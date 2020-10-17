package cloudapps.mastermind;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.graphics.View;

public class GraphicsMasterMind extends MasterMind {
	
	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}	

}
