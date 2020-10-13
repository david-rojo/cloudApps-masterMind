package cloudapps.mastermind;

public abstract class Combination {
	
	protected Color[] colors;
	
	protected Combination (){
		
		this.colors = new Color[Result.SOLUTION_LENGTH];
	}
}
