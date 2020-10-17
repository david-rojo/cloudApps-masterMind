package cloudapps.mastermind;

import cloudapps.mastermind.models.Game;
import cloudapps.mastermind.views.View;

public abstract class MasterMind {

	private Game game;

    private View view;

    protected MasterMind() {
        this.game = new Game();
        this.view = this.createView(this.game);
    }

    protected abstract View createView(Game game);

    protected void play() {
        this.view.interact();
    }
}
