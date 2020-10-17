package cloudapps.mastermind.views.console;

import cloudapps.mastermind.models.SecretCombination;
import cloudapps.mastermind.views.MessageView;
import cloudapps.utils.Console;

public class SecretCombinationView {

	public SecretCombinationView() {
		super();
	}

	public void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		Console.instance().writeln();
	}

}
