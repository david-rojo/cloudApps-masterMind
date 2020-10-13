package cloudapps.mastermind;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import cloudapps.mastermind.utils.Console;

public class SecretCombination extends Combination {
	
	public SecretCombination() {
		super();
		this.generate();
	}

	public Result getResult(ProposedCombination proposedCombination) {
		int blacks = 0;
		for (int i=0; i< this.colors.length; i++) {
			if (proposedCombination.contains(this.colors[i], i)) {
				blacks++;
			}
		}
		int whites = 0;
		for (Color c : this.colors) {
			if (proposedCombination.contains(c)) {
				whites++;
			}
		}
		return new Result(blacks, whites);
	}
	
	public void writeln() {
		Console.instance().write("**** - ");
		for (Color color : this.colors) {
			color.write();
		}
		Console.instance().writeln();
	}
	
	private void generate() {
		
		Set<Color> allColors = new HashSet<Color>();
		for (int i=0; i<Color.length()-1; i++) {
			allColors.add(Color.get(i));
		}
		
		Iterator<Color> iter = allColors.iterator();
		int colorsAdded = 0;
		while (iter.hasNext() && colorsAdded < Result.SOLUTION_LENGTH) {
			colors[colorsAdded] = iter.next();
			colorsAdded++;
		}		
	}
}
