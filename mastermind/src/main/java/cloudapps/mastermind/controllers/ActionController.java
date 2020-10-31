package cloudapps.mastermind.controllers;

import java.util.List;

import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.models.SessionImplementation;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class ActionController extends Controller {
	
	private SessionImplementation sessionImplementation;

	public ActionController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public boolean isWinner() {
		return this.sessionImplementation.isWinner();
	}

	public boolean isLooser() {
		return this.sessionImplementation.isLooser();
	}
	
	public boolean isFinished() {
		return this.sessionImplementation.isFinished();
	}

	public int getAttempts() {
		return this.sessionImplementation.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.sessionImplementation.getColors(position);
	}

	public int getBlacks(int position) {
		return this.sessionImplementation.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.sessionImplementation.getWhites(position);
	}
	
	public void addProposedCombination(List<Color> colors) {
		this.sessionImplementation.addProposedCombination(colors);
	}

	public int getCombinationWidth() {
		return this.sessionImplementation.getCombinationWidth();		
	}	
	
	public void continueState() {
		this.sessionImplementation.next();
	}

	public Error getProposedCombinationError(List<Color> colors) {
		return this.sessionImplementation.getProposedCombinationError(colors);
	}
	
}
