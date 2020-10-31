package cloudapps.mastermind.distributed;

import java.util.ArrayList;
import java.util.List;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.TCPIP;
import cloudapps.mastermind.models.Session;
import cloudapps.mastermind.types.Color;
import cloudapps.mastermind.types.Error;

public class PlayControllerProxy extends PlayController {

	private TCPIP tcpip;
	
	public PlayControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void addProposedCombination(List<Color> colors) {
		this.tcpip.send(FrameType.ADD_PROPOSED_COMBINATION.name());
		for (Color color : colors) {
			this.tcpip.send(color);	
		}
	}

	@Override
	public boolean isWinner() {
		this.tcpip.send(FrameType.WINNER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isLooser() {
		this.tcpip.send(FrameType.LOOSER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isFinished() {
		this.tcpip.send(FrameType.FINISHED.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public int getAttempts() {
		this.tcpip.send(FrameType.ATTEMPTS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public List<Color> getColors(int position) {
		int combinationWidth = this.getCombinationWidth();
		this.tcpip.send(FrameType.COLORS_OF_POSITION.name());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i< combinationWidth; i++) {
			colors.add(this.tcpip.receiveColor());
		}
		return colors;
	}

	@Override
	public int getBlacks(int position) {
		this.tcpip.send(FrameType.BLACKS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public int getWhites(int position) {
		this.tcpip.send(FrameType.WHITES.name());
		return this.tcpip.receiveInt();	
	}

	@Override
	public void continueState() {
		this.tcpip.send(FrameType.CONTINUE_STATE.name());		
	}

	@Override
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());
	}

	@Override
	public boolean undoable() {
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());
	}

	@Override
	public boolean redoable() {
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public Error getProposedCombinationError(List<Color> colors) {
		this.tcpip.send(FrameType.ERRORS_PROPOSED_COMBINATION.name());
		for (Color color : colors) {
			this.tcpip.send(color);
		}		
		return this.tcpip.receiveError();
	}

	@Override
	public int getCombinationWidth() {
		this.tcpip.send(FrameType.COMBINATION_WIDTH.name());
		return this.tcpip.receiveInt();
	}

}
