package cloudapps.mastermind.views;

import cloudapps.mastermind.utils.Console;

public enum MessageView {
	TITLE("----- MASTERMIND -----"), 
	PROPOSED_COMBINATION("Propose a combination: "),
	ATTEMPTS("#a attempt(s): "), 
	RESUME("Do you want to continue"),
	LOOSER("You've lost!!!"),
	WINNER("You've won!!!"), 
	RESULT(" --> #b blacks and #w whites"),
	SECRET("*"),
	TEXT_SEPARATOR(" - ");
	
	private String message;
	
	private MessageView(String message) {
		this.message = message;
	}

	public void write() {
		Console.instance().write(this.message);
	}

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	public void writeln(int blacks, int whites) {
		Console.instance().writeln(this.message.replaceAll("#b", "" + blacks).replaceAll("#w", "" + whites));		
	}
	
	public void writeln(int attempts) {
		Console.instance().writeln(this.message.replaceAll("#a", "" + attempts));
	}
	
	@Override
	public String toString() {
		return this.message;
	}

}
