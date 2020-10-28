package cloudapps.mastermind.controllers;

import java.util.List;

import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class ActionController extends UseCaseController {

	public ActionController(Session session) {
	    super(session);
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}

	public int getAttempts() {
		return this.session.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}

	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.session.getWhites(position);
	}
	
	public Error addProposedCombination(List<Color> colors) {
		Error error = this.session.addProposedCombination(colors);
		if (error.isNull() && this.session.isFinished()) {
			this.session.next();
		}
		return error;
	}

	public int getCombinationWidth() {
		return this.session.getCombinationWidth();		
	}	
	
}
