package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.Console;

public class PlayView {

	public boolean interact(PlayController playController) {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		playController.addProposedCombination(proposedCombination);
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(playController.getAttempts());
		new SecretCombinationView().writeln();
		for (int i = 0; i < playController.getAttempts(); i++) {
			new ProposedCombinationView(playController.getProposedCombination(i)).write();
			new ResultView(playController.getResult(i)).writeln();
		}
		if (playController.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (playController.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
