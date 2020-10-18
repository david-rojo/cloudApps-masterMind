package cloudapps.mastermind.views.console;

import cloudapps.mastermind.controllers.Logic;

public class SubView {

  protected Logic logic;

	SubView(Logic logic) {
		assert logic != null;
		
		this.logic = logic;
  }
  
}
