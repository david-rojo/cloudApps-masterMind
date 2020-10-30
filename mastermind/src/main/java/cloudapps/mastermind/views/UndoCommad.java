package cloudapps.mastermind.views;

import cloudapps.mastermind.controllers.PlayController;

class UndoCommand extends Command {

  UndoCommand(PlayController playController) {
    super(MessageView.UNDO_COMMAND.getMessage(), playController);
  }

  protected void execute() {
    this.playController.undo();
  }

  protected boolean isActive() {
    return this.playController.undoable();
  }

}
