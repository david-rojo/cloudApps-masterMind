package cloudapps.mastermind;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.views.graphics.View;

public class GraphicsMasterMind extends MasterMind {
	
	@Override
	protected View createView(PlayController playController, ResumeController resumeController){
		return new View(playController, resumeController);
	}

	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}

}
