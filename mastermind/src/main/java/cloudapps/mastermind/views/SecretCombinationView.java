package cloudapps.mastermind.views;

import cloudapps.mastermind.models.SecretCombination;
import cloudapps.utils.Console;

public class SecretCombinationView {

	SecretCombinationView() {
		super();
	}

	public void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		Console.instance().writeln();
	}

}
