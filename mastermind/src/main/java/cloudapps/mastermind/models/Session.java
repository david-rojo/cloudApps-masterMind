package cloudapps.mastermind.models;

import java.util.List;

import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class Session {

	private Game game;
	private GameRegistry registry;
	private State state;

	public Session() {
		this.state = new State();
		this.game = new Game();
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void next() {
		this.state.next();
	}

	public void reset() {
		this.game.reset();
		this.state.reset();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}
	
	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}
	
	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}
	
	public Error addProposedCombination(List<Color> colors) {
	    Error error = this.game.addProposedCombination(colors);
	    if (error.isNull()){
	    	this.registry.register();
	    }
	    return error;
	}

	public void undo() {
		this.registry.undo();
	}

	public boolean undoable() {
		return this.registry.isUndoable();
	}

	public void redo() {
		this.registry.redo();
	}

	public boolean redoable() {
		return this.registry.isRedoable();
	}
	
	public void startRegistry() {
		this.registry = new GameRegistry(this.game);
	}
	
	public boolean isFinished() {
		return this.game.isLooser() || this.game.isWinner();
	}

	public int getCombinationWidth() {
		return this.game.getCombinationWidth();
	}

}
