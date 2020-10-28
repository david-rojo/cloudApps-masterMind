package cloudapps.mastermind.models;

import java.util.List;

class GameMemento {
	
	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;
	


	public GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
		this.proposedCombinations = proposedCombinations;
		this.results = results;
		this.attempts = attempts;
	}

	int getAttempts() {
		return attempts;
	}

	public List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	public void setProposedCombinations(List<ProposedCombination> proposedCombinations) {
		this.proposedCombinations = proposedCombinations;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
}
