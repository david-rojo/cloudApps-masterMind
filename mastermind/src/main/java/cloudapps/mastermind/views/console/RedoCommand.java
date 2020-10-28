package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.views.MessageView;

class RedoCommand extends Command {

  RedoCommand(PlayController playController) {
    super(MessageView.REDO_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {
    this.playController.redo();
  }

  @Override
  protected boolean isActive() {
    return this.playController.redoable();
  }

}
