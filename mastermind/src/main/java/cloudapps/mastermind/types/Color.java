package cloudapps.mastermind.types;

public enum Color {

	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE;
	
	private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};
	
	public static Color getInstance(char character) {
		for (int i = 0; i < Color.INITIALS.length; i++) {
			if (Color.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
	public static char getInitial(Color color) {
		return Color.INITIALS[color.ordinal()];
	}
	
	public static String getInitials() {
		String result = "";
		for(char character: Color.INITIALS) {
			result += character;
		}
		return result;
	}
	
	public static int length() {
		return Color.values().length;
	}

}
