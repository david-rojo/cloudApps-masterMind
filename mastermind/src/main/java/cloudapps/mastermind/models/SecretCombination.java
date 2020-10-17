package cloudapps.mastermind.models;

import cloudapps.mastermind.views.ColorView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecretCombination extends Combination {

	public SecretCombination() {
		super();
		this.generate();
	}
	
	private void generate() {
		
		Set<Color> allColors = new HashSet<Color>();
		String initials = ColorView.getInitials();
		for (int i=0; i<Color.length(); i++) {
			allColors.add(ColorView.getInstance(initials.charAt(i)));
		}
		
		Iterator<Color> iter = allColors.iterator();
		int colorsAdded = 0;
		do {
			colors.add(iter.next());
			colorsAdded++;
		} while (iter.hasNext() && colorsAdded < Combination.length());

	}

	public Result getResult(ProposedCombination proposedCombination) {
		int blacks = 0;
		for (int i=0; i< this.colors.size(); i++) {
			if (proposedCombination.contains(this.colors.get(i), i)) {
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
	
	public Color getColorAt(int index) {
		assert index>=0 && index < Combination.length();
		
		return colors.get(index);
	}

}
