package cloudapps.mastermind;

import cloudapps.mastermind.utils.Console;

public class Board {
	
	private static final int MAX_ATTEMPS = 10;
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombinations;
	private Result[] results;
	private int attempts;
	
	public Board() {
		secretCombination = new SecretCombination();
		proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
		results = new Result[MAX_ATTEMPS];
		attempts = 0;
	}
	
	public void writeln() {
	    Console.instance().writeln();
	    Message.ATTEMPTS.writeln(attempts);
	    secretCombination.writeln();
	    for (int i = 0; i < this.attempts; i++) {
	      proposedCombinations[i].write();
	      results[i].writeln();
	    }		
	}
	
	public boolean isWinner() {		
		return results[attempts-1].isWinner();
	}
	
	public boolean isLooser() {		
		return attempts == MAX_ATTEMPS;
	}

	public void add(ProposedCombination proposedCombination) {
		proposedCombinations[attempts] = proposedCombination;
		results[attempts] = secretCombination.getResult(proposedCombination);
		attempts++;		
	}

	public boolean isFinished() {		
		return isWinner() || isLooser();
	}

}
