package cloudapps.mastermind.views;

import cloudapps.mastermind.models.ProposedCombination;
import cloudapps.mastermind.types.Color;
import cloudapps.utils.Console;

public class ProposedCombinationView {
	
	ProposedCombinationView() {

	}

	public void write(ProposedCombination proposedCombination) {
		for (Color color: proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public String read() {
		return Console.instance().readString();
	}

}
