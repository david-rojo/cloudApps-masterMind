package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Color;
import cloudapps.mastermind.models.Combination;
import cloudapps.mastermind.models.Error;
import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.utils.Console;
import java.util.HashSet;
import java.util.Set;

public class ProposedCombinationView {

	private ProposedCombination proposedCombination;

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public void write() {
		for (Color color: this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public void read() {
		Error error;
		do {
			MessageView.PROPOSED_COMBINATION.write();
			String candidateCombination = Console.instance().readString();
			error = this.check(candidateCombination);
			Console.instance().writeln();
			if (!error.isNull()) {
				this.populate(candidateCombination);
			}
			if (error != null) {
				new ErrorView(error).writeln();
				this.proposedCombination.getColors().clear();
			}
		} while (error.isNull());
	}
	
	private Error check(String candidateCombination) {
		assert candidateCombination != null && !candidateCombination.isEmpty();
		
		if (candidateCombination.length() != Combination.length()) {
			return Error.WRONG_LENGTH;
		}
		Set<String> included = new HashSet<String>();
		for (int i=0; i<candidateCombination.length(); i++) {
			String currentCharacter = String.valueOf(candidateCombination.charAt(i));
			if (!ColorView.getInitials().contains(currentCharacter)) {
				return Error.WRONG_CHARACTERS;
			}
			if (included.contains(currentCharacter)) {
				return Error.DUPLICATED;
			}
			else {
				included.add(currentCharacter);
			}
		}					
		return null;
	}
	
	private void populate(String candidateCombination) {
		assert candidateCombination != null && !candidateCombination.isEmpty();
		
		for (int i=0; i<Combination.length(); i++) {
			Color color = ColorView.getInstance(candidateCombination.charAt(i));
			this.proposedCombination.getColors().add(color);
		}
	}
}
