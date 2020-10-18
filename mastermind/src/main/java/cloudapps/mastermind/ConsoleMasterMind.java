package cloudapps.mastermind;

import cloudapps.mastermind.views.console.View;

public class ConsoleMasterMind extends MasterMind {

	@Override
	protected View createView(){
		return new View();
	}

	public static void main(String[] args) {
		new ConsoleMasterMind().play();
	}
	
}
