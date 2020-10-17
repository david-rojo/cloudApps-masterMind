package cloudapps.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

	private static final int LENGTH = 4;

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	public static int length() {
		return Combination.LENGTH;
	}
	
	public List<Color> getColors() {
		return this.colors;
	}
}
