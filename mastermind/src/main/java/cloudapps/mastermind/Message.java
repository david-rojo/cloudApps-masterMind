package cloudapps.mastermind;

import cloudapps.mastermind.utils.Console;

public enum Message {
	TITLE("----- MASTERMIND -----"), 
	PROPOSED_COMBINATION("Propose a combination: "),
	ATTEMPTS("#a attempt(s): "), 
	RESUME("Do you want to continue"),
	LOOSER("You've lost!!!"),
	WINNER("You've won!!!"), 
	RESULT(" --> #b blacks and #w whites");

	private String message;

	private Message() {
		
	}
	
	private Message(String message) {
		
		this.message = message;
	}
	
	void write() {
		
		Console.instance().write(this.message);
	}

	void writeln() {
		
		Console.instance().writeln(this.message);
	}

	void writeln(int blacks, int whites) {
		
		assert this == Message.RESULT;

		Console.instance().writeln(this.message.replaceAll("#b", "" + blacks).replaceAll("#w", "" + whites));		
	}
	
	void writeln(int attempts) {
		
		assert this == Message.ATTEMPTS;

		Console.instance().writeln(this.message.replaceAll("#a", "" + attempts));
	}
}
