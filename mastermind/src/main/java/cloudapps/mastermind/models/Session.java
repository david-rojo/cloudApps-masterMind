package cloudapps.mastermind.models;

import java.util.List;

import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class Session {

	private Game game;
	private GameRegistry registry;
	private State state;
	private TCPIP tcpip;

	public Session(TCPIP tcpip) {
		this.state = new State();
		this.game = new Game();
		this.registry = new GameRegistry(this.game);
        this.tcpip = tcpip;
	}

	public StateValue getValueState() {
		if (this.tcpip == null) {
			return this.state.getValueState();
		}
		this.tcpip.send(FrameType.STATE.name());
		return StateValue.values()[this.tcpip.receiveInt()];
	}

	public void next() {
		this.state.next();
	}

	public void reset() {
		this.game.reset();
		this.state.reset();
		this.registry.reset();
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
	
	public void addProposedCombination(List<Color> colors) {
	    this.game.addProposedCombination(colors);
	    this.registry.register();
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
	
	public boolean isFinished() {
		return this.game.isLooser() || this.game.isWinner();
	}

	public int getCombinationWidth() {
		return this.game.getCombinationWidth();
	}

	public Error getProposedCombinationError(List<Color> colors) {
		return this.game.getProposedCombinationError(colors);
	}

}
