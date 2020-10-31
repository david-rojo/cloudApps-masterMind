package cloudapps.mastermind.controllers.implementation;

import java.util.List;

import cloudapps.mastermind.controllers.ActionController;
import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.RedoController;
import cloudapps.mastermind.controllers.UndoController;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class PlayControllerImplementation extends PlayController {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public PlayControllerImplementation(Session session) {
		super(session);
		this.actionController = new ActionController(this.session);
		this.undoController = new UndoController(this.session);
		this.redoController = new RedoController(this.session);
	}
	
	@Override
	public void addProposedCombination(List<Color> colors) {
		this.actionController.addProposedCombination(colors);
	}
	
	@Override
	public boolean isWinner() {
		return this.actionController.isWinner();
	}

	@Override
	public boolean isLooser() {
		return this.actionController.isLooser();
	}
	
	@Override
	public boolean isFinished() {
		return this.actionController.isFinished();
	}
	
	@Override
	public int getAttempts() {
		return this.actionController.getAttempts();
	}
	
	@Override
	public List<Color> getColors(int position) {
		return this.actionController.getColors(position);
	}

	@Override
	public int getCombinationWidth() {
		return this.actionController.getCombinationWidth();
	}	
	
	@Override
	public int getBlacks(int position) {
		return this.actionController.getBlacks(position);
	}

	@Override
	public int getWhites(int position) {
		return this.actionController.getWhites(position);	
	}

	@Override
	public void continueState() {
		this.actionController.continueState();
	}

	@Override
	public void undo() {
		this.undoController.undo();
	}

	@Override
	public boolean undoable() {
		return this.undoController.undoable();
	}

	@Override
	public void redo() {
		this.redoController.redo();
	}

	@Override
	public boolean redoable() {
		return this.redoController.redoable();
	}
	
	@Override
	public Error getProposedCombinationError(List<Color> colors) {
		return this.actionController.getProposedCombinationError(colors);
	}
}
