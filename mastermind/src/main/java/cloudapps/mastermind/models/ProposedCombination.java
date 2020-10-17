package cloudapps.mastermind.models;

public class ProposedCombination extends Combination {

	public boolean contains(Color color) {
		assert color != null;
		
		for (int i=0; i<this.colors.size(); i++) {
			if (colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(Color color, int i) {
		assert color != null;
		assert i >=0 && i<Combination.length();
		
		return this.colors.get(i) == color;
	}
}
