package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.ProposalController;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

	private ProposalController proposalController;

	AttemptsView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.proposalController.getAttempts()));
	}

}
