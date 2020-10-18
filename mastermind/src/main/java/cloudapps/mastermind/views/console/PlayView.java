package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.Console;

public class PlayView {

    private PlayController playController;

    PlayView(PlayController playController) {
        this.playController = playController;
    }

	public boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.playController.addProposedCombination(proposedCombination);
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
		new SecretCombinationView().writeln();
		for (int i = 0; i < this.playController.getAttempts(); i++) {
			new ProposedCombinationView(this.playController.getProposedCombination(i)).write();
			new ResultView(this.playController.getResult(i)).writeln();
		}
		if (this.playController.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.playController.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
