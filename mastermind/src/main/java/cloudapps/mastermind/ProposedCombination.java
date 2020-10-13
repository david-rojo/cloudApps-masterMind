package cloudapps.mastermind;

import java.util.HashSet;
import java.util.Set;
import cloudapps.mastermind.utils.Console;


public class ProposedCombination extends Combination {

	public void read() {
		
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			String candidateCombination = Console.instance().readString();
			error = this.check(candidateCombination);
			Console.instance().writeln();
			if (!error.isNull()) {
				this.populate(candidateCombination);
			}
		} while (error.isNull());
		
	}
	
	public void write() {
		
		for (Color color : this.colors) {
			color.write();
		}
	}

	public boolean contains(Color color) {
		
		for (int i=0; i<this.colors.length; i++) {
			if (this.colors[i] == color) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(Color color, int i) {
		
		return this.colors[i] == color;
	}
	
	private Error check(String candidateCombination) {
		
		if (candidateCombination.length() != Result.SOLUTION_LENGTH) {
			return Error.WRONG_LENGTH;
		}
		Set<String> included = new HashSet<String>();
		for (int i=0; i<candidateCombination.length(); i++) {
			String currentCharacter = String.valueOf(candidateCombination.charAt(i));
			if (!Color.getInitials().contains(currentCharacter)) {
				return Error.WRONG_CHARACTERS;
			}
			if (included.contains(currentCharacter)) {
				return Error.DUPLICATED;
			}
			else {
				included.add(currentCharacter);
			}
		}					
		return Error.NULL_ERROR;
	}
	
	private void populate(String candidateCombination) {
		
		for (int i=0; i<Result.SOLUTION_LENGTH; i++) {
			colors[i] = Color.getInstance(candidateCombination.charAt(i));
		}
	}

}
