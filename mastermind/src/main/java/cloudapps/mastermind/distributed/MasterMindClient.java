package cloudapps.mastermind.distributed;

import cloudapps.mastermind.MasterMind;

public class MasterMindClient extends MasterMind {

	@Override
	protected boolean isStandalone() {
		return false;
	}
	
	public static void main(String[] args) {
		new MasterMindClient().play();
	}
	
}
