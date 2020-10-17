package cloudapps.mastermind.models;

public class Board {

	private static final int MAX_ATTEMPS = 10;
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombinations;
	private Result[] results;
	private int attempts;

	public Board() {
		this.reset();
	}
	
	public void reset() {
		secretCombination = new SecretCombination();
		proposedCombinations = new ProposedCombination[Board.maxAttempts()];
		results = new Result[Board.maxAttempts()];
		attempts = 0;
	}

	public void addProposedCombination(ProposedCombination proposedCombination) {
		proposedCombinations[attempts] = proposedCombination;
		results[attempts] = secretCombination.getResult(proposedCombination);
		attempts++;		
	}
	
	public boolean isWinner() {		
		return results[attempts-1].isWinner();
	}
	
	public boolean isLooser() {		
		return attempts == Board.maxAttempts();
	}
	
	public static int maxAttempts() {
		return MAX_ATTEMPS;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public ProposedCombination getProposedCombination(int i) {
		assert i>=0 && i<Board.maxAttempts();
		
		return proposedCombinations[i];
	}

	public Result getResult(int i) {
		assert i>=0 && i<Board.maxAttempts();
		
		return results[i];
	}

}
