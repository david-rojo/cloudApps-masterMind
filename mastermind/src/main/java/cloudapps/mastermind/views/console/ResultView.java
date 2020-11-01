package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Result;
import cloudapps.mastermind.views.MessageView;

public class ResultView {

	public void writeln(Result result) {
		MessageView.RESULT.writeln(result.getBlacks(), result.getWhites());
	}

}
