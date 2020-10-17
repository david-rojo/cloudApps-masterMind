package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Result;
import cloudapps.mastermind.views.MessageView;

class ResultView {
	
	private Result result;

	public ResultView(Result result) {
		this.result = result;
	}

	public void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
