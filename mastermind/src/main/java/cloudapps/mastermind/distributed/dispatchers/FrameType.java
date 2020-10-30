package cloudapps.mastermind.distributed.dispatchers;

public enum FrameType {
	START,
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	CLOSE,
	CONTINUE_STATE,
	NEW_GAME,
	WINNER,
	LOOSER,
	ATTEMPTS,
	BLACKS,
	WHITES,
	ADD_PROPOSED_COMBINATION,
	COMBINATION_WIDTH,
	COLORS_OF_POSITION,
	ERRORS_PROPOSED_COMBINATION,
	FINISHED;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}

}
