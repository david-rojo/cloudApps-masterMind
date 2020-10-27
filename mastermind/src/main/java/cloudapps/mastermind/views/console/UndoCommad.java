package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.views.MessageView;

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
