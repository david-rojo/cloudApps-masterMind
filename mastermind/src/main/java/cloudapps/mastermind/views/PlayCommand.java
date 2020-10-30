package cloudapps.mastermind.views;

import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;

public class PlayCommand extends Command {

	PlayCommand(PlayController playController) {
		super(MessageView.ACTION_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		List<Color> colors = new ProposedCombinationView(playController).read();
		this.playController.addProposedCombination(colors);
		this.console.writeln();

		new AttemptsView(this.playController).writeln();
		new SecretCombinationView(this.playController).writeln();
		for (int i = 0; i < this.playController.getAttempts(); i++) {
			new ProposedCombinationView(this.playController).write(i);
			new ResultView(this.playController).writeln(i);
		}

		if (this.playController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (this.playController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
		
		if (this.playController.isFinished()) {
			this.playController.continueState();
		}
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
