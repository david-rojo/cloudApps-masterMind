package cloudapps.mastermind;

import cloudapps.mastermind.views.View;
import cloudapps.mastermind.views.console.ConsoleView;

public class ConsoleMasterMind extends MasterMind{

	protected View createView() {
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new ConsoleMasterMind().play();
	}
}
