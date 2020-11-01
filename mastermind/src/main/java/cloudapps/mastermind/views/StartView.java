package cloudapps.mastermind.views;

public class StartView {

	public void write() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();	
	}

}
