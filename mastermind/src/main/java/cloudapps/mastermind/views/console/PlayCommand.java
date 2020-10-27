package cloudapps.mastermind.views.console;

import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;
import cloudapps.mastermind.views.MessageView;

public class PlayCommand extends Command {

	PlayCommand(PlayController playController) {
		super(MessageView.ACTION_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(playController).read();
			error = playController.addProposedCombination(colors);
			if (!error.isNull()) {
				new ErrorView(error).writeln();
			}
		} while (!error.isNull());
		this.console.writeln();
		new AttemptsView(playController).writeln();
		new SecretCombinationView(playController).writeln();
		for (int i = 0; i < playController.getAttempts(); i++) {
			new ProposedCombinationView(playController).write(i);
			new ResultView(playController).writeln(i);
		}
		if (playController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (playController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
		
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
