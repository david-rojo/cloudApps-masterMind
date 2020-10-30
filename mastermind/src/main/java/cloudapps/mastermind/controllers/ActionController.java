package cloudapps.mastermind.controllers;

import java.util.List;

import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class ActionController extends Controller {

	public ActionController(Session session) {
	    super(session);
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}
	
	public boolean isFinished() {
		return this.session.isFinished();
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
	
	public void addProposedCombination(List<Color> colors) {
		this.session.addProposedCombination(colors);
	}

	public int getCombinationWidth() {
		return this.session.getCombinationWidth();		
	}	
	
	public void continueState() {
		this.session.next();
	}

	public Error getProposedCombinationError(List<Color> colors) {
		return this.session.getProposedCombinationError(colors);
	}
	
}
