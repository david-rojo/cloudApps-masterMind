package cloudapps.mastermind;

import cloudapps.mastermind.controllers.PlayController;
import cloudapps.mastermind.controllers.ResumeController;
import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.View;

public abstract class MasterMind {

	private Game game;
    private PlayController proposalController;
    private ResumeController resumeController;
    private View view;

    protected MasterMind() {
        this.game = new Game();
        this.proposalController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.proposalController, this.resumeController);
    }

    protected abstract View createView(PlayController playController, ResumeController resumeController);

    protected void play() {
        this.view.interact();
    }
    
}
