package cloudapps.mastermind.controllers;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class PlayController extends AcceptorController {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public PlayController(Session session, TCPIP tcpip) {
		super(session, tcpip);
		if (tcpip == null) {
			this.actionController = new ActionController(session);
			this.undoController = new UndoController(session);
			this.redoController = new RedoController(session);
		}
	}

	public void addProposedCombination(List<Color> colors) {
		if (this.tcpip == null) {
			this.actionController.addProposedCombination(colors);
		}
		else {
			this.tcpip.send(FrameType.ADD_PROPOSED_COMBINATION.name());
			for (Color color : colors) {
				this.tcpip.send(color);	
			}
		}
	}
	
	public boolean isWinner() {
		if (this.tcpip == null) {
			return this.actionController.isWinner();
		}
		this.tcpip.send(FrameType.WINNER.name());
		return this.tcpip.receiveBoolean();
	}

	public boolean isLooser() {
		if (this.tcpip == null) {
			return this.actionController.isLooser();
		}
		this.tcpip.send(FrameType.LOOSER.name());
		return this.tcpip.receiveBoolean();
	}
	
	public boolean isFinished() {
		if (this.tcpip == null) {
			return this.actionController.isFinished();
		}
		this.tcpip.send(FrameType.FINISHED.name());
		return this.tcpip.receiveBoolean();
	}
	
	public int getAttempts() {
		if (this.tcpip == null) {
			return this.actionController.getAttempts();
		}
		this.tcpip.send(FrameType.ATTEMPTS.name());
		return this.tcpip.receiveInt();
	}

	public List<Color> getColors(int position) {
		if (this.tcpip == null) {
			return this.actionController.getColors(position);
		}
		this.tcpip.send(FrameType.COLORS_OF_POSITION.name());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<this.getCombinationWidth(); i++) {
			colors.add(this.tcpip.receiveColor());
		}
		return colors;
	}

	public int getCombinationWidth() {
		if (this.tcpip == null) {
			return super.getCombinationWidth();
		}
		this.tcpip.send(FrameType.COMBINATION_WIDTH.name());
		return this.tcpip.receiveInt();
	}	
	
	public int getBlacks(int position) {
		if (this.tcpip == null) {
			return this.actionController.getBlacks(position);
		}
		this.tcpip.send(FrameType.BLACKS.name());
		return this.tcpip.receiveInt();
	}

	public int getWhites(int position) {
		if (this.tcpip == null) {
			return this.actionController.getWhites(position);
		}
		this.tcpip.send(FrameType.WHITES.name());
		return this.tcpip.receiveInt();	
	}

	public void continueState() {
		if (this.tcpip == null) {
			this.actionController.continueState();
		} else {
			this.tcpip.send(FrameType.CONTINUE_STATE.name());
		}
	}

	public void undo() {
		if (this.tcpip == null) {
			this.undoController.undo();
		} else {
			this.tcpip.send(FrameType.UNDO.name());
		}
	}

	public boolean undoable() {
		if (this.tcpip == null) {
			return this.undoController.undoable();
		}
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	public void redo() {
		if (this.tcpip == null) {
			this.redoController.redo();
		} else {
			this.tcpip.send(FrameType.REDO.name());
		}
	}

	public boolean redoable() {
		if (this.tcpip == null) {
			return this.redoController.redoable();
		}
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}
	
	@Override
	public void accept(ControllersVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public Error getProposedCombinationError(List<Color> colors) {
		if (this.tcpip == null) {
			return this.actionController.getProposedCombinationError(colors);
		}
		this.tcpip.send(FrameType.ERRORS_PROPOSED_COMBINATION.name());
		for (Color color : colors) {
			this.tcpip.send(color);
		}		
		return this.tcpip.receiveError();
	}

}
