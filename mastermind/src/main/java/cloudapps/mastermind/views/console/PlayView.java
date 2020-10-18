package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.Console;

public class PlayView extends SubView {

    PlayView(Logic logic) {
        super(logic);
    }

	public boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.logic.addProposedCombination(proposedCombination);
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(this.logic.getAttempts());
		new SecretCombinationView().writeln();
		for (int i = 0; i < this.logic.getAttempts(); i++) {
			new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
			new ResultView(this.logic.getResult(i)).writeln();
		}
		if (this.logic.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.logic.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
