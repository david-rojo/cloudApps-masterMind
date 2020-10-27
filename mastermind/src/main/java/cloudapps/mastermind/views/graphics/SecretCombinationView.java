package cloudapps.mastermind.views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import cloudapps.mastermind.controllers.UseCaseController;
import cloudapps.mastermind.views.MessageView;

@SuppressWarnings("serial")
class SecretCombinationView extends JPanel {

	private static final String TITLE = "SECRET COMBINATION:";

	private JLabel title;

	private JLabel secretCombination;
	
	private UseCaseController controller;

	SecretCombinationView(UseCaseController controller) {
		super();
		this.controller = controller;
		this.setLayout(new GridBagLayout());
		this.title = new JLabel(SecretCombinationView.TITLE);
		this.add(this.title, new Constraints(0, 0, 3, 1));
		String text = "";
		for (int i = 0; i < this.controller.getCombinationWidth(); i++) {
			text += MessageView.SECRET.getMessage();
		}
		this.secretCombination = new JLabel(text);
		this.add(this.secretCombination, new Constraints(0, 1, 3, 1));
		this.setVisible(true);
	}
}
