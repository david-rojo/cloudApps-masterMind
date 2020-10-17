package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Result;

public class ResultView {

	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	public void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}
}
