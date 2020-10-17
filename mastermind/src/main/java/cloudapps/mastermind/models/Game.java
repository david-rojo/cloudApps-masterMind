package cloudapps.mastermind.models;

public class Game {
	
	private Board board;
	
	 public Game() {
		 board = new Board();
	 }
	 
	public void reset() {
		board.reset();
	}

	public SecretCombination getSecretCombination() {
		return board.getSecretCombination();
	}

	public void addProposedCombination(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		board.addProposedCombination(proposedCombination);		
	}

	public int getAttempts() {
		return board.getAttempts();
	}

	public ProposedCombination getProposedCombination(int i) {
		return board.getProposedCombination(i);
	}
	
	public boolean isWinner() {
		return board.isWinner();
	}
	
	public boolean isLooser() {
		return board.isLooser();
	}

	public Result getResult(int i) {
		return board.getResult(i);
	}

}
