package cloudapps.mastermind.views;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;
import cloudapps.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {
	
	private PlayController playController;
	
	ProposedCombinationView(PlayController playController) {
		this.playController = playController;
	}
	
	void write(int position) {
		for (Color color : this.playController.getColors(position)) {
			new ColorView(color).write();
		}
	}

	List<Color> read() {
		String characters;
		List<Color> colors = new ArrayList<Color>();
		Error error;
        do {
        	characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
        	for (int i=0; i<characters.length(); i++) {
    			colors.add(ColorView.getInstance(characters.charAt(i)));
    		}
        	error = this.playController.getProposedCombinationError(colors);
        	if (!error.isNull()) {
                new ErrorView(error).writeln();
                colors.clear();
        	}        	
        }  while (!error.isNull());
		return colors;
	}
	
}
