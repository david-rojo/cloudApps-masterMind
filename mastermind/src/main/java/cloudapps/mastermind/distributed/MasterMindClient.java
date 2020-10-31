package cloudapps.mastermind.distributed;

import cloudapps.mastermind.MasterMind;
import cloudapps.mastermind.controllers.Logic;

public class MasterMindClient extends MasterMind {

	private LogicProxy logicProxy;
	
	@Override
	protected Logic createLogic() {
		this.logicProxy = new LogicProxy();
		return this.logicProxy;
	}

	@Override
	protected void play() {
		super.play();
		this.logicProxy.close();
	}
	
	public static void main(String[] args) {
		new MasterMindClient().play();
	}

	
}
