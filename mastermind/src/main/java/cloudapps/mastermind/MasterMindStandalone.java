package cloudapps.mastermind;

public class MasterMindStandalone extends MasterMind{

	@Override
	protected boolean isStandalone() {
		return true;
	}

	public static void main(String[] args) {
		new MasterMindStandalone().play();
	}
}
