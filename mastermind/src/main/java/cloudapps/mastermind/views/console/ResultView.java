package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private PlayController playController;
	
	ResultView(PlayController playController){
		this.playController = playController;
	}

	void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.playController.getBlacks(i))
				.replaceFirst("#whites", "" + this.playController.getWhites(i)));
	}

}
