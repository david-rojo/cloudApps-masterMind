package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.Console;

public class ProposalView extends SubView {

	private SecretCombinationView secretCombinationView;
	
	public ProposalView(Game game) {
		super(game);
		this.secretCombinationView = new SecretCombinationView();
	}

	public boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.game.addProposedCombination(proposedCombination);
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(this.game.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.game.getAttempts(); i++) {
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();
			new ResultView(this.game.getResult(i)).writeln();
		}
		if (this.game.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.game.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
