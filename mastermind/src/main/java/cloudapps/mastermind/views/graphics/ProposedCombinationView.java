package cloudapps.mastermind.views.graphics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.views.ColorView;

@SuppressWarnings("serial")
class ProposedCombinationView extends JLabel {

	public static final int ERROR_CODE = -1;
	
	private PlayController playController;

	ProposedCombinationView(PlayController proposalController) {
		this.playController = proposalController;
		String initials = "";
		for (Color color : this.playController.getColors(this.playController.getAttempts()-1)) {
			initials += new ColorView(color).getInitial();
		}
		this.setText(initials);
	}

	ProposedCombinationView() {
	}

	List<Color> read(String characters) {
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}

}
