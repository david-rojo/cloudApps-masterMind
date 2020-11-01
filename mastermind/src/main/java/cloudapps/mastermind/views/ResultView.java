package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Result;

public class ResultView {

	public void writeln(Result result) {
		MessageView.RESULT.writeln(result.getBlacks(), result.getWhites());
	}

}
