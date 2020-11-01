package cloudapps.mastermind.models;

import java.util.List;

import cloudapps.mastermind.views.console.ColorView;

public class ProposedCombination extends Combination {

	public ProposedCombination(String proposal) {
		super();
		for (int i = 0; i < proposal.length(); i++) {
			Color color = ColorView.getInstance(proposal.charAt(i));
			this.getColors().add(color);
		}
	}
	
	public ProposedCombination() {
		super();
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public List<Color> getColors() {
		return this.colors;
	}

}
