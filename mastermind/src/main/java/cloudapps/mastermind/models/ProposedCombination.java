package cloudapps.mastermind.models;

import java.util.List;
import java.util.stream.Collectors;

import cloudapps.mastermind.types.Color;

class ProposedCombination extends Combination {

	ProposedCombination(List<Color> colors) {
		this.colors = colors;
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
	
	protected ProposedCombination copy() {
		List<Color> clonedColors = this.colors.stream().collect(Collectors.toList());
		ProposedCombination clonedProposedCombination = new ProposedCombination(clonedColors);
		return clonedProposedCombination;
	}

}
