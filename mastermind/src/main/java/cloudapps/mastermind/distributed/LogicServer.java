package cloudapps.mastermind.distributed;

import cloudapps.mastermind.controllers.Logic;
import cloudapps.mastermind.distributed.dispatchers.AddProposedCombinationDispatcher;
import cloudapps.mastermind.distributed.dispatchers.AttemptsDispatcher;
import cloudapps.mastermind.distributed.dispatchers.BlacksDispatcher;
import cloudapps.mastermind.distributed.dispatchers.ColorsOfPositionDispatcher;
import cloudapps.mastermind.distributed.dispatchers.CombinationWidthDispatcher;
import cloudapps.mastermind.distributed.dispatchers.ContinueStateDispatcher;
import cloudapps.mastermind.distributed.dispatchers.DispatcherPrototype;
import cloudapps.mastermind.distributed.dispatchers.FinishedDispatcher;
import cloudapps.mastermind.distributed.dispatchers.FrameType;
import cloudapps.mastermind.distributed.dispatchers.LooserDispatcher;
import cloudapps.mastermind.distributed.dispatchers.ResumeDispatcher;
import cloudapps.mastermind.distributed.dispatchers.StartDispatcher;
import cloudapps.mastermind.distributed.dispatchers.StateDispatcher;
import cloudapps.mastermind.distributed.dispatchers.WhitesDispatcher;
import cloudapps.mastermind.distributed.dispatchers.WinnerDispatcher;
import cloudapps.mastermind.distributed.dispatchers.errors.ErrorsProposedCombinationDispatcher;
import cloudapps.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import cloudapps.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import cloudapps.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import cloudapps.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicServer extends Logic {

	public LogicServer(Boolean isStandalone) {
		super(isStandalone);
	}

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.FINISHED, new FinishedDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.COMBINATION_WIDTH, new CombinationWidthDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ERRORS_PROPOSED_COMBINATION, new ErrorsProposedCombinationDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ADD_PROPOSED_COMBINATION, new AddProposedCombinationDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.COLORS_OF_POSITION, new ColorsOfPositionDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.CONTINUE_STATE, new ContinueStateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeController));
	}
}
