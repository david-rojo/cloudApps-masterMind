package cloudapps.mastermind.views;

import cloudapps.mastermind.models.Combination;
import cloudapps.mastermind.models.SecretCombination;
import cloudapps.mastermind.utils.Console;

public class SecretCombinationView {

	private SecretCombination secretCombination;
	
	public SecretCombinationView(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;	
	}
	
	public void writeln() {
		for (int i = 0; i < Combination.length(); i++) {
			MessageView.SECRET.write();
		}
		MessageView.TEXT_SEPARATOR.write();
		for (int j = 0; j < Combination.length(); j++) {
			new ColorView(secretCombination.getColorAt(j)).write();
		}
		Console.instance().writeln();
	}

}
