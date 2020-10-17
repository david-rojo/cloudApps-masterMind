package cloudapps.mastermind.models;

public class Result {

	private int blacks = 0;
	private int whites = 0;
	
	Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;

		this.blacks = blacks;
		this.whites = whites;
	}

	public boolean isWinner() {
		return this.blacks == Combination.length();
	}
	
	public int getBlacks() {
		return blacks;
	}
	
	public int getWhites() {
		return whites;
	}
}
