package cloudapps.mastermind;

import cloudapps.mastermind.views.View;
import cloudapps.mastermind.views.graphics.GraphicsView;

public class GraphicsMasterMind extends MasterMind{

	protected View createView() {
		return new GraphicsView();
	}
	
	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}
}
