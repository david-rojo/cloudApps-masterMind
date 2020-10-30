package cloudapps.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class Game {

	private static final int MAX_LONG = 10;
	private SecretCombination secretCombination;
	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	public Game() {
		this.reset();
	}

	public void reset() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = 0;
	}

	public void addProposedCombination(List<Color> colors) {
		ProposedCombination proposedCombination = new ProposedCombination(colors);
		this.proposedCombinations.add(proposedCombination);
		this.results.add(this.secretCombination.getResult(proposedCombination));
		this.attempts++;
	}

	public boolean isLooser() {
		return this.attempts == Game.MAX_LONG;
	}
	
	public boolean isWinner() {
		return this.results.get(this.attempts-1).isWinner();
	}

	public int getAttempts() {
		return this.attempts;
	}

	public List<Color> getColors(int position) {
		return this.proposedCombinations.get(position).colors;
	}

	public int getBlacks(int position) {
		return this.results.get(position).getBlacks();
	}

	public int getWhites(int position) {
		return this.results.get(position).getWhites();
	}

	public int getCombinationWidth() {
		return Combination.getWidth();
	}
	
	public GameMemento createMemento() {
        return new GameMemento(this.copyProposedCombinations(), this.copyResults(), this.attempts);
	}
	
	public void set(GameMemento memento) {
		this.proposedCombinations = memento.getProposedCombinations();
		this.results = memento.getResults();
		this.attempts = memento.getAttempts();
	}
	
	private List<ProposedCombination> copyProposedCombinations() {
		List<ProposedCombination> clonedProposedCombinations = new ArrayList<ProposedCombination>();
		for (ProposedCombination pc : this.proposedCombinations) {
			clonedProposedCombinations.add(pc.copy());
		}
		return clonedProposedCombinations;
	}
	
	private List<Result> copyResults() {
		List<Result> clonedResults = new ArrayList<Result>();
		for (Result r : this.results) {
			clonedResults.add(r.copy());
		}
		return clonedResults;
	}

	public Error getProposedCombinationError(List<Color> colors) {
		if (colors.size() != Combination.getWidth()) {
			return Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					return Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							return Error.DUPLICATED;
						}
					}
				}				
			}
		}
		return Error.NULL;
	}
	
}
