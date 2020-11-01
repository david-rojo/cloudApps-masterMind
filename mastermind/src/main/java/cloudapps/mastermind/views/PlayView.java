package cloudapps.mastermind.views;

import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.models.Result;
import cloudapps.mastermind.types.Error;
import cloudapps.utils.Console;

public class PlayView {
	
	public String readProposedCombination() {
		return new ProposedCombinationView().read();
	}

	public void writeErrorProposedCombination(Error error) {
		new ErrorView(error).writeln();		
	}
	
	public void writeTitleProposedCombination() {
		MessageView.PROPOSED_COMBINATION.write();
	}
	
	public void writeAttempts(int attempts) {
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(attempts);		
	}
	
	public void writeSecretCombination() {
		new SecretCombinationView().writeln();
	}
	
	public void writeProposedCombination(ProposedCombination proposedCombination) {
		new ProposedCombinationView().write(proposedCombination);		
	}
	
	public void writeResult(Result result) {
		new ResultView().writeln(result);	
	}

	public void writeWinner() {
		MessageView.WINNER.writeln();		
	}

	public void writeLooser() {
		MessageView.LOOSER.writeln();
	}

}
